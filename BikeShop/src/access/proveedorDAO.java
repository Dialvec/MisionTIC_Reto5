package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelProveedorMotor;
import utils.ConnectionDB;

public class ProveedorDAO {
    
private Connection conn = null;

    public static boolean existeProveedor(Connection conn, String nombre) throws SQLException 
    {
        boolean proveedorExiste = false;
        
        String sql = "SELECT nombre\n" +
                     "FROM proveedor_motor\n" +
                     "WHERE nombre = ?;";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, nombre);
        int rows = statement.executeUpdate();
        
        if (rows > 0) proveedorExiste = true;
        
        return proveedorExiste;
    }
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelProveedorMotor> getAllproveedores() {
        ArrayList<ModelProveedorMotor> proveedores = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM proveedor_motor;";
            Statement statement = conn.createStatement();
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
        return proveedores;
    }

    public static void create (Connection conn, String nombre,String direccion, String telefono) throws SQLException
    {
        String create = "INSERT INTO proveedor_motor(nombre, direccion, telefono) VALUES (?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, nombre);
        Statement.setString(2, direccion);
        Statement.setString(3, telefono);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
        }
    }

    /**
     * 
     * @param proveedores 
     */
    public void updateProveedor(ModelProveedorMotor proveedores) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE proveedor_motor SET nombre =?, direccion =?, telefono =? WHERE nombre=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, proveedores.getNombre());
            statement.setString(2, proveedores.getDireccion());
            statement.setString(3, proveedores.getTelefono());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
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
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM proveedor_motor WHERE nombre=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
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
}


