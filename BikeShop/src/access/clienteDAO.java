package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCliente;

import utils.ConnectionDB;

public class ClienteDAO {
    
    private Connection conn = null;


    public static boolean existeCliente(Connection conn, String alias) throws SQLException 
    {
        boolean clienteExiste = false;
        
        String sql = "SELECT alias\n" +
                     "FROM cliente\n" +
                     "WHERE alias = ?;";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, alias);
        int rows = statement.executeUpdate();
        
        if (rows > 0) clienteExiste = true;
        
        return clienteExiste;
    }
        
    /**
     * 
     * @return 
     * @throws java.sql.SQLException 
     */
    public ArrayList<ModelCliente> getAllClientes() throws SQLException {
        ArrayList<ModelCliente> clientes = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT alias, nombres, apellidos, email, contrasena, celular, dob FROM cliente;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                String alias = result.getString(1);
                String nombres = result.getString(2);
                String apellidos = result.getString(3);
                String email = result.getString(4);
                int contrasena = result.getInt(5);
                String celular = result.getString(6);
                String dob = result.getString(7);
                
                ModelCliente cliente = new ModelCliente(alias, nombres, apellidos, email, contrasena, celular, dob);
                clientes.add(cliente);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        conn.close();
        return clientes;
    }

    public static void create (Connection conn, String alias, String nombres,String apellidos, String email, int contrasena, String celular, String dob) throws SQLException
    {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String create = "INSERT INTO cliente(alias, nombres, apellidos, email, contrasena, celular, dob) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement Statement = conn.prepareStatement(create);
            Statement.setString(1, alias);
            Statement.setString(2, nombres);
            Statement.setString(3, apellidos);
            Statement.setString(4, email);
            Statement.setInt(5, contrasena);
            Statement.setString(6, celular);
            Statement.setString(7, dob);
            int arrows = Statement.executeUpdate();
            if (arrows > 0){
                JOptionPane.showMessageDialog(null, 
                            "El nuevo Cliente se agregó satisfactoriamente", 
                            "Operación Exitosa", 
                            JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        conn.close();
    }

    /**
     * 
     * @param clientes 
     * @throws java.sql.SQLException 
     */
    public void updateClientes(ModelCliente clientes) throws SQLException {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE cliente SET alias =?, nombres=?, apellidos =?, email =?, contrasena =?, celular =?, dob =? WHERE alias=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, clientes.getAlias());
            statement.setString(2, clientes.getNombres());
            statement.setString(3, clientes.getApellidos());
            statement.setString(4, clientes.getEmail());
            statement.setInt(5, clientes.getContrasena());
            statement.setString(6, clientes.getCelular());
            statement.setString(7, clientes.getDob());
            statement.setString(8, clientes.getAlias());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        conn.close();
    }

    
    /**
     * 
     * @param alias 
     * @throws java.sql.SQLException 
     */
    public void deleteClientes(String alias) throws SQLException {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM cliente WHERE alias=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, alias);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        conn.close();
    }
    
}


