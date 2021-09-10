package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelProveedorMotor;
import utils.BikeShopParameters;
import utils.ConnectionDB;

public class ProveedorDAO {
    
private Connection conn = null;

    public boolean existeProveedor(String nombre){
        
        boolean proveedorExiste = false;
        try {
            setConn(ConnectionDB.getConnection());

            String sql = "SELECT nombre\n" +
                        "FROM proveedor_motor\n" + 
                        "WHERE nombre = ?;";

            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, nombre);
            ResultSet resultSQL = statement.executeQuery();

            if (resultSQL.next()) 
                proveedorExiste = true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                                            + "\nError :" + ex.getMessage());
        }
    return proveedorExiste;
    }
        
    /**
     * 
     * @return 
     * @throws java.sql.SQLException 
     */
    public ArrayList<ModelProveedorMotor> getAllproveedores() throws SQLException {
        ArrayList<ModelProveedorMotor> proveedores = new ArrayList();
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql          = "SELECT nombre, direccion, telefono FROM proveedor_motor;";
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ModelProveedorMotor proveedor = new ModelProveedorMotor(result.getString(1), result.getString(2),result.getString(3));
                proveedores.add(proveedor);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        getConn().close();
        return proveedores;
    }

    /**
     *
     * @param proveedor
     */
    public void createProveedor (ModelProveedorMotor proveedor){
        
        String proveedorFields = "nombre";
        String valuesFields = "?";
        int fieldCount = 2;
        try {
            setConn(ConnectionDB.getConnection());
            
            if(!proveedor.getDireccion().isBlank()){
                proveedorFields += ", direccion";
                valuesFields += ", ?";
            }
            
            if(!proveedor.getTelefono().isBlank()){
                proveedorFields += ", telefono";
                valuesFields += ", ?";
            }

            String create = "INSERT INTO proveedor_motor(" + proveedorFields + ") VALUES (" + valuesFields + ")";

            PreparedStatement Statement = getConn().prepareStatement(create);
            Statement.setString(1, proveedor.getNombre());
            
            if(!proveedor.getDireccion().isBlank()){
                Statement.setString(fieldCount, proveedor.getDireccion());
                fieldCount ++;
            }
            
            if(!proveedor.getTelefono().isBlank()){
                Statement.setString(3, proveedor.getTelefono());
            }

            int arrows = Statement.executeUpdate();

            if (arrows > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.PROVEEDOR_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 
     * @param proveedor
     */
    public void updateProveedor(ModelProveedorMotor proveedor) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "UPDATE proveedor_motor SET direccion = ?, telefono = ? WHERE nombre=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, proveedor.getDireccion());
            statement.setString(2, proveedor.getTelefono());
            statement.setString(3, proveedor.getNombre());
            
            int rowsUpdated = statement.executeUpdate();
            
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.PROVEEDOR_UPDATE, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param nombre 
     */
    public void deleteProveedor(String nombre) {
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM proveedor_motor WHERE nombre = ?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, nombre);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
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