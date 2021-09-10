package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelBicicleta;
import model.ModelVehiculo;
import utils.BikeShopParameters;

import utils.ConnectionDB;

public class BicicletaDAO {
    
private Connection conn = null;
private final VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelBicicleta> getAllbicicletas() {
        ArrayList<ModelBicicleta> bicicletas = new ArrayList();
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql          = "SELECT id_bicicleta, fabricante_fk, precio, anio_fabrica FROM bicicleta;";
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                int id_bicicleta = result.getInt(1);
                String fabricante_fk = result.getString(2);
                int precio = result.getInt(3);
                int anio_fabrica = result.getInt(4);
                
                ModelBicicleta bicicleta = new ModelBicicleta(id_bicicleta, fabricante_fk, precio, anio_fabrica);
                bicicletas.add(bicicleta);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return bicicletas;
    }
    
    
    /**
     * 
     * @param modelBicicleta
     * @return 
     */
    public ArrayList<ModelBicicleta> searchBicicletas(ModelBicicleta modelBicicleta) {
        ArrayList<ModelBicicleta> bicicletas = new ArrayList();
        String operadorPrecio;
        String operadorAnio;
        
        operadorPrecio = (modelBicicleta.getPrecio() == 0)?">=":"=";
        operadorAnio = (modelBicicleta.getAnio_fabrica() == 0)?">=":"=";
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "SELECT\n" + 
                        "id_bicicleta, fabricante_fk, precio, anio_fabrica\n" +
                        "FROM bicicleta\n" +
                        "WHERE\n" +
                        "fabricante_fk LIKE ?\n" +
                        "AND precio " + operadorPrecio + " ?\n" +
                        "AND anio_fabrica " + operadorAnio + " ?;";
            
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, modelBicicleta.getFabricante_fk());
            statement.setInt(2, modelBicicleta.getPrecio());
            statement.setInt(3, modelBicicleta.getAnio_fabrica());
            
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                int id_bicicleta = result.getInt(1);
                String fabricante_fk = result.getString(2);
                int precio = result.getInt(3);
                int anio_fabrica = result.getInt(4);
                
                ModelBicicleta bicicleta = new ModelBicicleta(id_bicicleta, fabricante_fk, precio, anio_fabrica);
                bicicletas.add(bicicleta);
            }
            
            if (bicicletas.isEmpty()) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.BUSQUEDA_VACIA, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return bicicletas;
    }
    

    /**
     *
     * @param bicicleta
     */
    public void createBicicleta( ModelBicicleta bicicleta ){
        
        String biciFields = "fabricante_fk";
        String valuesFields = "?";
        int fieldCount = 2;
        
        try {
            setConn(ConnectionDB.getConnection());

            if(vehiculoDAO.existeFabricante(bicicleta.getFabricante_fk())){
                JOptionPane.showMessageDialog(null, BikeShopParameters.FABRICANTE_REPETIDO, BikeShopParameters.TITULO_CAMPO_REPETIDO, JOptionPane.INFORMATION_MESSAGE);
            } else{
                vehiculoDAO.createVehiculo(new ModelVehiculo(bicicleta.getFabricante_fk()));
            
                if(bicicleta.getPrecio() != 0){
                    biciFields += ", precio";
                    valuesFields += ", ?";
                }

                if(bicicleta.getAnio_fabrica() != 0){
                    biciFields += ", anio_fabrica";
                    valuesFields += ", ?";
                }


                String create = "INSERT INTO bicicleta(" + biciFields + ") VALUES (" + valuesFields + ");";

                PreparedStatement Statement = getConn().prepareStatement(create);

                Statement.setString(1, bicicleta.getFabricante_fk());

                if(bicicleta.getPrecio() != 0){
                    Statement.setInt(fieldCount, bicicleta.getPrecio());
                    fieldCount ++;
                }

                if(bicicleta.getAnio_fabrica() != 0){
                    Statement.setInt(fieldCount, bicicleta.getAnio_fabrica());
                }

                int arrows = Statement.executeUpdate();

                if (arrows > 0)
                    JOptionPane.showMessageDialog(null, BikeShopParameters.BICI_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    /**
     * 
     * @param bicicletas 
     */
    public void updateBicicletas(ModelBicicleta bicicletas){
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "UPDATE bicicleta SET precio =?, Anio_fabrica =? WHERE fabricante_fk=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, bicicletas.getPrecio());
            statement.setInt(2, bicicletas.getAnio_fabrica());
            statement.setString(3, bicicletas.getFabricante_fk());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.BICI_UPDATE, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
            getConn().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param idBicicleta 
     */
    public void deleteBicicletaById(int idBicicleta) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM bicicleta WHERE id_bicicleta=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, idBicicleta);
            
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.BICI_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    public void deleteBicicleta(ModelBicicleta bicicleta) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM bicicleta WHERE idBicicleta=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, bicicleta.getId_bicicleta());
            
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.BICI_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
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