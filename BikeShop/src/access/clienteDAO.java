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

public class clienteDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelCliente> getAllClientes() {
        ArrayList<ModelCliente> clientes = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM cliente;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ModelCliente cliente = new ModelCliente(result.getString(1), result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6),result.getString(7));
                clientes.add(cliente);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return clientes;
    }

    public static void create (Connection conn, String alias, String nombres,String apellidos, String email, int contraseña, String celular, String dob) throws SQLException
    {
        String create = "INSERT INTO cliente(alias, nombres, apellidos, email, contraseña, celular, dob) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, alias);
        Statement.setString(2, nombres);
        Statement.setString(3, apellidos);
        Statement.setString(4, email);
        Statement.setInt(5, contraseña);
        Statement.setString(6, celular);
        Statement.setString(7, dob);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
        }
    }

    /**
     * 
     * @param clientes 
     */
    public void updateClientes(ModelCliente clientes) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE cliente SET alias =?, nombres=?, apellidos =?, email =?, contraseña =?, celular =?, dob =? WHERE alias=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, clientes.getAlias());
            statement.setString(2, clientes.getNombres());
            statement.setString(3, clientes.getApellidos());
            statement.setString(4, clientes.getEmail());
            statement.setInt(5, clientes.getContrasena());
            statement.setString(6, clientes.getCelular());
            statement.setString(7, clientes.getDob());
            
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
     * @param alias 
     */
    public void deleteClientes(String alias) {
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
    }
}


