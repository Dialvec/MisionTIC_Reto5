package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelIntencion;

import utils.ConnectionDB;

public class intencionDAO {
    
private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ModelIntencion> getAllintencion() {
        ArrayList<ModelIntencion> intenciones = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT * FROM intencion;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                int id_intencion = result.getInt(1);
                String alias_cliente_fk = result.getString(2);
                String fabricante_fk = result.getString(3);
                String fechahora = result.getString(4);
                ModelIntencion intencion = new ModelIntencion(id_intencion, alias_cliente_fk, fabricante_fk, fechahora);
                intenciones.add(intencion);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return intenciones;
    }

    public static void create (Connection conn, int id_intencion, String alias_cliente, String fabricante, String datetime) throws SQLException
    {
        String create = "INSERT INTO intencion(alias_cliente_fk, fabricante_fk, datetime) VALUES (?,?,?)";
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
    public void updateIntenciones(ModelIntencion intenciones) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE intencion SET alias_cliente=?, fabricante =?, datetime=? WHERE alias_cliente=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, intenciones.getAlias_cliente_fk());
            statement.setString(2, intenciones.getFabricante_fk());
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


