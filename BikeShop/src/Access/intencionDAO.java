package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.intencionModel;


public class intencionDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<intencionModel> getAllintencion() {
        ArrayList<intencionModel> intenciones = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM intencion;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                intencionModel intencion = new intencionModel(result.getInt(1), result.getString(2),result.getString(3),result.getString(4));
                intenciones.add(intencion);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return intenciones;
    }

    public static void create (Connection conn,int id_intencion, String alias_cliente,String fabricante, String datetime) throws SQLException
    {
        String create = "INSERT INTO intencion(alias_cliente, fabricante, datetime) VALUES (?,?,?)";
        PreparedStatement Statement = conn.prepareStatement(create);
        Statement.setString(1, alias_cliente);
        Statement.setString(2, fabricante);
        Statement.setString(3, datetime);
        int arrows = Statement.executeUpdate();
        if (arrows > 0)
        {
            System.out.println("Se agregó información");
        }
    }

    /**
     * 
     * @param intenciones 
     */
    public void updateIntenciones(intencionModel intenciones) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE intencion SET alias_cliente=?, fabricante =?, datetime=? WHERE alias_cliente=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, intenciones.getAlias_cliente());
            statement.setString(2, intenciones.getFabricante());
            statement.setString(3, intenciones.getDatetime());
            
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
     * @param id_intencion 
     */
    public void deleteIntencion(int id_intencion) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM intencion WHERE id_intencion=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id_intencion);
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


