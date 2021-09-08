package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelMotoElectrica;
import utils.ConnectionDB;

public class motoElectricaDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelMotoElectrica> getAllMotos() {
        ArrayList<ModelMotoElectrica> motos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM moto_electrica;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                
                int id_moto = result.getInt(1);
                String fabricante_fk = result.getString(2);
                int precio = result.getInt(3);
                String proveedor_motor_fk = result.getString(4);
                int autonomia = result.getInt(5);
                
                ModelMotoElectrica moto = new ModelMotoElectrica(id_moto, fabricante_fk, precio, proveedor_motor_fk, autonomia);
                motos.add(moto);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return motos;
    }

    public static void create (Connection conn,int id_moto, String fabricante,int precio, String proveedor_motor, String autonomia) throws SQLException
    {
        String create = "INSERT INTO moto_electrica(fabricante, precio, proveedor_motor, autonomia) VALUES (?,?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, fabricante);
        Statement.setInt(2, precio);
        Statement.setString(3, proveedor_motor);
        Statement.setString(4,autonomia);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
        }
    }

    /**
     * 
     * @param motos 
     */
    public void updateMotos(ModelMotoElectrica motos) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE moto_electrica SET fabricante =?, precio =?, proveedor_motor=?, autonomia=? WHERE fabricante=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, motos.getFabricante_fk());
            statement.setInt(2, motos.getPrecio());
            statement.setString(3, motos.getProveedor_motor_fk());
            statement.setInt(4, motos.getAutonomia());
            
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
     * @param id_moto 
     */
    public void deleteMoto(int id_moto) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM moto_electrica WHERE id_moto=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id_moto);
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


