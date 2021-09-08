package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelBicicleta;

import utils.ConnectionDB;

public class BicicletaDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelBicicleta> getAllbicicletas() {
        ArrayList<ModelBicicleta> bicicletas = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT id_bicicleta, fabricante_fk, precio, anio_fabrica FROM bicicleta;";
            Statement statement = conn.createStatement();
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

    public static void create (Connection conn, int idBicicleta, String fabricante_fk, int precio, int anio_fabrica) throws SQLException
    {
        String create = "INSERT INTO bicicleta(fabricante_fk, precio, anio_fabrica) VALUES (?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, fabricante_fk);
        Statement.setInt(2, precio);
        Statement.setInt(3, anio_fabrica);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            JOptionPane.showMessageDialog(null, 
                        "La nueva bicicleta se agregó satisfactoriamente", 
                        "Operación Exitosa", 
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * 
     * @param bicicletas 
     */
    public void updateBicicletas(ModelBicicleta bicicletas) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE bicicleta SET fabricante_fk =?, precio =?, Anio_fabrica =? WHERE fabricante=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, bicicletas.getFabricante_fk());
            statement.setInt(2, bicicletas.getPrecio());
            statement.setInt(3, bicicletas.getAnio_fabrica());
            statement.setString(4, bicicletas.getFabricante_fk());
            
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
     * @param idBicicleta 
     */
    public void deleteBicicleta(int idBicicleta) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM bicicleta WHERE idBicicleta=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idBicicleta);
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


