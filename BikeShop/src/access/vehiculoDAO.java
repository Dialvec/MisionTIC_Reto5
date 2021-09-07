package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.vehiculoModel;
import utils.ConnectionDB;

public class vehiculoDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<vehiculoModel> getAllvehiculos() {
        ArrayList<vehiculoModel> vehiculos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT fabricante, precio FROM vehiculo;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                vehiculoModel vehiculo = new vehiculoModel(result.getString(1), result.getInt(2));
                vehiculos.add(vehiculo);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return vehiculos;
    }

    public static void create (Connection conn, String fabricante, int precio) throws SQLException
    {
        String create = "INSERT INTO vehiculo(fabricante, precio) VALUES (?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, fabricante);
        Statement.setInt(2, precio);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
        }
    }

    /**
     * 
     * @param vehiculos 
     */
    public void updateVehiculos(vehiculoModel vehiculos) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE vehiculo SET fabricante =?, precio =? WHERE fabricante=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, vehiculos.getFabricante());
            statement.setInt(2, vehiculos.getPrecio());
            
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
     * @param fabricante 
     */
    public void deleteVehiculo(String fabricante) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM vehiculo WHERE fabricante=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fabricante);
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
