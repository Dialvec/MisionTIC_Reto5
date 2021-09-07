package acess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelBicicleta;

import utils.ConnectionDB;

public class bicicletaDAO {
    
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
            
            String sql          = "SELECT * FROM bicicleta;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ModelBicicleta bicicleta = new ModelBicicleta(result.getInt(1), result.getString(2),result.getInt(3),result.getInt(4));
                bicicletas.add(bicicleta);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return bicicletas;
    }

    public static void create (Connection conn,int idBicicleta, String fabricante_fk,int precio, int Anio_fabrica) throws SQLException
    {
        String create = "INSERT INTO bicicleta(fabricante_fk, precio, Anio_fabrica) VALUES (?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, fabricante_fk);
        Statement.setInt(2, precio);
        Statement.setInt(3, Anio_fabrica);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
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


