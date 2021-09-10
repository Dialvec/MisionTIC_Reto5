package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.ModelVehiculo;
import utils.BikeShopParameters;
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
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql          = "SELECT fabricante FROM vehiculo;";
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ModelVehiculo vehiculo = new ModelVehiculo(result.getString(1));
                vehiculos.add(vehiculo);
            }
            getConn().close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return vehiculos;
    }

    public void createVehiculo (ModelVehiculo vehiculo){
        try {
            
            if(existeFabricante(vehiculo.getFabricante())){
                JOptionPane.showMessageDialog(null, BikeShopParameters.FABRICANTE_REPETIDO, BikeShopParameters.TITULO_CAMPO_REPETIDO, JOptionPane.INFORMATION_MESSAGE);
            } else{
                setConn(ConnectionDB.getConnection());

                String create = "INSERT INTO vehiculo(fabricante) VALUES (?)";
                PreparedStatement Statement = getConn().prepareStatement(create);
                Statement.setString(1, vehiculo.getFabricante());

                int arrows = Statement.executeUpdate();

                if (arrows > 0)
                    JOptionPane.showMessageDialog(null, BikeShopParameters.VEHICULO_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
                else
                     JOptionPane.showMessageDialog(null, "No se crea nuevo Vehìculo", BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
    
    public boolean existeFabricante(String fabricante){
        
        boolean fabricanteExiste = false;
        
        try {
            setConn(ConnectionDB.getConnection());

            String sql = "SELECT fabricante\n" +
                    "FROM vehiculo\n" +
                    "WHERE fabricante = ?;";

            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, fabricante);

            ResultSet SQLresult = statement.executeQuery();

            if(SQLresult.next() == true)
                fabricanteExiste = true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                                            + "\nError :" + ex.getMessage());
        }
        return fabricanteExiste;
    }

    
    /**
     * 
     * @param vehiculo
     */
    public void deleteVehiculo(ModelVehiculo vehiculo) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM vehiculo WHERE fabricante=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, vehiculo.getFabricante());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    /**
     * 
     * @param fabricante 
     */
    public void deleteVehiculoByFabricante(String fabricante) {
        try {
            if(getConn() == null)
                setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM vehiculo WHERE fabricante=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
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

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
