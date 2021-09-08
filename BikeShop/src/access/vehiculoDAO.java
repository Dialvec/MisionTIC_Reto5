package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.ModelVehiculo;
import utils.ConnectionDB;

public class VehiculoDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelVehiculo> getAllvehiculos() {
        ArrayList<ModelVehiculo> vehiculos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT fabricante FROM vehiculo;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ModelVehiculo vehiculo = new ModelVehiculo(result.getString(1), result.getInt(2));
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
        String create = "INSERT INTO vehiculo(fabricante) VALUES (?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, fabricante);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó nuevo vehículo");
        }
    }
    
    public static boolean existeFabricante(Connection conn, String fabricante) throws SQLException 
    {
        boolean fabricanteExiste = false;
        
        String sql = "SELECT fabricante\n" +
                     "FROM vehiculo\n" +
                     "WHERE fabricante = ?;";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, fabricante);
        int rows = statement.executeUpdate();
        
        if (rows > 0) fabricanteExiste = true;
        
        return fabricanteExiste;
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
