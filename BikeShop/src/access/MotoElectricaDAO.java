package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelMotoElectrica;
import model.ModelProveedorMotor;
import model.ModelVehiculo;
import utils.BikeShopParameters;
import utils.ConnectionDB;

public class MotoElectricaDAO {
    
private Connection conn = null;
private final VehiculoDAO vehiculoDAO = new VehiculoDAO();
private final ProveedorDAO proveedorDAO = new ProveedorDAO();
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelMotoElectrica> getAllMotos() {
        ArrayList<ModelMotoElectrica> motos = new ArrayList();
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "SELECT id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia FROM moto_electrica;";
            
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                int id_moto = result.getInt(1);
                String fabricante_fk = result.getString(2);
                int precio = result.getInt(3);
                String proveedor_motor_fk = result.getString(4);
                int autonomia = result.getInt(5);
                
                ModelMotoElectrica moto = new ModelMotoElectrica(id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia);
                motos.add(moto);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return motos;
    }
    
    /**
     * 
     * @param modelMoto
     * @return 
     */
    public ArrayList<ModelMotoElectrica> searchMoto( ModelMotoElectrica modelMoto ) {
        
        ArrayList<ModelMotoElectrica> motos = new ArrayList();
        
        String operadorPrecio;
        String operadorAutonomia;
        
        
        operadorPrecio = (modelMoto.getPrecio() == 0)?">=":"=";
        operadorAutonomia = (modelMoto.getAutonomia() == 0)?">=":"=";
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "SELECT\n" + 
                        "id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia\n" +
                        "FROM moto_electrica\n" +
                        "WHERE\n" +
                        "fabricante_fk LIKE ?\n" +
                        "AND precio " + operadorPrecio + " ?\n" +
                        "AND proveedor_motor_fk LIKE ?\n" +
                        "AND autonomia " + operadorAutonomia + " ?;";
            
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, modelMoto.getFabricante_fk());
            statement.setInt(2, modelMoto.getPrecio());
            statement.setString(3, modelMoto.getProveedor_motor_fk());
            statement.setInt(4, modelMoto.getAutonomia());
            
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                
                int id_moto = result.getInt(1);
                String fabricante_fk = result.getString(2);
                int precio = result.getInt(3);
                String proveedor_motor_fk = result.getString(4);
                int autonomia = result.getInt(5);
                
                ModelMotoElectrica moto = new ModelMotoElectrica(id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia);
                motos.add(moto);
            }
            
            if(motos.isEmpty())
                JOptionPane.showMessageDialog(null, BikeShopParameters.BUSQUEDA_VACIA, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return motos;
    }

    public void createMoto( ModelMotoElectrica moto ) throws SQLException{
        
        boolean existeFabricante = vehiculoDAO.existeFabricante(moto.getFabricante_fk());
        boolean existeProveedor = proveedorDAO.existeProveedor(moto.getProveedor_motor_fk());
        
        setConn(ConnectionDB.getConnection());
        
        if(existeFabricante & existeProveedor){
            JOptionPane.showMessageDialog(null, BikeShopParameters.MOTO_REPETIDA, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
        } else{
            if( !existeFabricante )
            vehiculoDAO.createVehiculo(new ModelVehiculo(moto.getFabricante_fk()));
        
        if( !existeProveedor )
            proveedorDAO.createProveedor(new ModelProveedorMotor(moto.getProveedor_motor_fk(), "", "") );
        
        String create = "INSERT INTO moto_electrica(fabricante_fk, precio, proveedor_motor_fk, autonomia) VALUES (?,?,?,?)";
        PreparedStatement Statement = getConn().prepareStatement(create);
        Statement.setString(1, moto.getFabricante_fk());
        Statement.setInt(2, moto.getPrecio());
        Statement.setString(3, moto.getProveedor_motor_fk());
        Statement.setInt(4, moto.getAutonomia());
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
            JOptionPane.showMessageDialog(null, BikeShopParameters.MOTO_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * 
     * @param moto
     */
    public void updateMoto(ModelMotoElectrica moto) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "UPDATE moto_electrica SET precio =?, proveedor_motor_fk=?, autonomia=? WHERE fabricante=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, moto.getPrecio());
            statement.setString(2, moto.getProveedor_motor_fk());
            statement.setInt(3, moto.getAutonomia());
            statement.setString(4, moto.getFabricante_fk());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.MOTO_UPDATE, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
            getConn().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param id_moto 
     */
    public void deleteMotoById(int id_moto) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM moto_electrica WHERE id_moto=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, id_moto);
            
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.MOTO_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
            getConn().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    
    /**
     * 
     * @param moto 
     */
    public void deleteMoto(ModelMotoElectrica moto) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM moto_electrica WHERE id_moto=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, moto.getId_moto());
            
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.MOTO_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
            getConn().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    


    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}