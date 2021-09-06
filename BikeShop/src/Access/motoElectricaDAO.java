package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.motoElectricaModel;

public class motoElectricaDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<motoElectricaModel> getAllMotos() {
        ArrayList<motoElectricaModel> motos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM moto_electrica;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                motoElectricaModel moto = new motoElectricaModel(result.getInt(1), result.getString(2),result.getInt(3),result.getString(4), result.getString(5));
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
    public void updateMotos(motoElectricaModel motos) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE moto_electrica SET fabricante =?, precio =?, proveedor_motor=?, autonomia=? WHERE fabricante=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, motos.getFabricante());
            statement.setInt(2, motos.getPrecio());
            statement.setString(3, motos.getProveedor_motor());
            statement.setString(4, motos.getAutonomia());
            
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


