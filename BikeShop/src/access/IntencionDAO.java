package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ModelCliente;

import model.ModelIntencion;
import model.ModelVehiculo;
import utils.BikeShopParameters;

import utils.ConnectionDB;

public class IntencionDAO {
    
private Connection conn = null;
private final ClienteDAO clienteDAO = new ClienteDAO();
private final VehiculoDAO vehiculoDAO = new VehiculoDAO();
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelIntencion> getAllintencion() {
        ArrayList<ModelIntencion> intenciones = new ArrayList();
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql          = "SELECT id_intencion, alias_cliente_fk, fabricante_fk, fechahora FROM intencion;";
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                int id_intencion = result.getInt(1);
                String alias_cliente_fk = result.getString(2);
                String fabricante_fk = result.getString(3);
                String fechahora = result.getString(4);
                
                ModelIntencion intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                intenciones.add(intencion);
            }

        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return intenciones;
    }
    
    
    /**
     * 
     * @param modelIntencion
     * @return 
     */
    public ArrayList<ModelIntencion> searchIntencion(ModelIntencion modelIntencion) {
        ArrayList<ModelIntencion> intenciones = new ArrayList();
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "SELECT\n" + 
                        "id_intencion, alias_cliente_fk, fabricante_fk, fechahora\n" +
                        "FROM intencion\n" +
                        "WHERE\n" +
                        "alias_cliente_fk LIKE ? \n" +
                        "AND fabricante_fk LIKE ? \n" +
                        "AND fechahora LIKE ?;";
            
            PreparedStatement statement = getConn().prepareStatement(sql);
            
            statement.setString(1, modelIntencion.getAlias_cliente_fk());
            statement.setString(2, modelIntencion.getFabricante_fk());
            statement.setString(3, modelIntencion.getFechahora());
            
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                int id_intencion = result.getInt(1);
                String alias_cliente_fk = result.getString(2);
                String fabricante_fk = result.getString(3);
                String fechahora = result.getString(4);
                
                ModelIntencion intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                intenciones.add(intencion);
            }
            
            if(intenciones.isEmpty())
                JOptionPane.showMessageDialog(null, BikeShopParameters.BUSQUEDA_VACIA, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return intenciones;
    }
    
    

    public void createIntencion (ModelIntencion intencion, String nombre, String apellido){
        try {
            setConn(ConnectionDB.getConnection());
            
            if(!clienteDAO.existeCliente(intencion.getAlias_cliente_fk()) ){
                if(nombre.isBlank()){
                    JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.NOMBRE_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE);
                } else if(apellido.isBlank()){
                    JOptionPane.showMessageDialog(new JFrame(), 
                                BikeShopParameters.APELLIDO_VACIO, 
                                BikeShopParameters.TITULO_CAMPO_VACIO, 
                                JOptionPane.INFORMATION_MESSAGE);
                } else{
                    clienteDAO.createCliente( new ModelCliente(intencion.getAlias_cliente_fk(), nombre, apellido ) );
                }
            }
            
            if( !vehiculoDAO.existeFabricante( intencion.getFabricante_fk() ) ){
                vehiculoDAO.createVehiculo( new ModelVehiculo( intencion.getFabricante_fk() ) );
            }
            
            String intencionFields = "alias_cliente_fk, fabricante_fk";
            String ValuesFields = "?, ?";

            if(!intencion.getFechahora().isBlank()){
                intencionFields += ", fechahora";
                ValuesFields += ",?";
            }

            String create = "INSERT INTO intencion("+ intencionFields +") VALUES (" + ValuesFields + ");";
            PreparedStatement Statement = getConn().prepareStatement(create);
            Statement.setString(1, intencion.getAlias_cliente_fk());
            Statement.setString(2, intencion.getFabricante_fk());

            if(!intencion.getFechahora().isBlank())
                Statement.setString(3, intencion.getFechahora());

            int arrows = Statement.executeUpdate();

            if (arrows > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.INTENCION_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "No se crea nuevo Cliente", BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    /**
     * 
     * @param intencion
     */
    public void updateIntenciones(ModelIntencion intencion) {
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "UPDATE intencion SET fechahora = ? WHERE alias_cliente_fk = ? AND fabricante_fk = ?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, intencion.getFechahora().trim());
            statement.setString(2, intencion.getAlias_cliente_fk());
            statement.setString(3, intencion.getFabricante_fk());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.INTENCION_UPDATE, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param id_intencion 
     */
    public void deleteIntencionById(int id_intencion) {
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM intencion WHERE id_intencion=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, id_intencion);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, BikeShopParameters.INTENCION_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    /**
     * 
     * @param intencion 
     */
    public void deleteIntencion(ModelIntencion intencion) {
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM intencion WHERE id_intencion=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setInt(1, intencion.getId_intencion());
            
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.INTENCION_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
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

    /**
     * @return the clienteDAO
     */
    public ClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    /**
     * @return the vehiculoDAO
     */
    public VehiculoDAO getVehiculoDAO() {
        return vehiculoDAO;
    }
}