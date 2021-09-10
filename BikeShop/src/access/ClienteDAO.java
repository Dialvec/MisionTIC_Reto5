package access;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCliente;
import utils.BikeShopParameters;

import utils.ConnectionDB;

public class ClienteDAO {
    
    private Connection conn = null;

    /**
     *
     * @param alias
     * @return
     */
    public boolean existeCliente(String alias){

        boolean clienteExiste = false;
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "SELECT alias FROM cliente WHERE alias = ?;";
            
            PreparedStatement preparedStatement = getConn().prepareStatement(sql);
            preparedStatement.setString(1, alias.trim());
            
            ResultSet SQLresult = preparedStatement.executeQuery();
            
            if(SQLresult.next() == true)
                clienteExiste = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                                        + "\nError :" + ex.getMessage());
        }
        
        return clienteExiste;
    }
        
    /**
     * 
     * @return 
     * @throws java.sql.SQLException 
     */
    public ArrayList<ModelCliente> getAllClientes() throws SQLException {
        ArrayList<ModelCliente> clientes = new ArrayList();
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql          = "SELECT alias, nombres, apellidos, email, contrasena, celular, dob FROM cliente;";
            Statement statement = getConn().createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                String alias = result.getString(1);
                String nombres = result.getString(2);
                String apellidos = result.getString(3);
                String email = result.getString(4);
                int contrasena = result.getInt(5);
                String celular = result.getString(6);
                String dob = result.getString(7);
                
                ModelCliente cliente = new ModelCliente(alias, nombres, apellidos, email, contrasena, celular, dob);
                clientes.add(cliente);
            }
            
            //getConn().close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return clientes;
    }

    /**
     *
     * @param modelCliente
     * @throws SQLException
     */
    public void createCliente(ModelCliente modelCliente) throws SQLException
    {
        String clienteFields = "alias, nombres, apellidos";
        String ValuesFields = "?, ?, ?";
        int fieldCounter = 4;
        
        try {
            setConn(ConnectionDB.getConnection());
            
            if(existeCliente(modelCliente.getAlias())){
                JOptionPane.showMessageDialog(null, BikeShopParameters.ALIAS_REPETIDO, BikeShopParameters.TITULO_CAMPO_REPETIDO, JOptionPane.INFORMATION_MESSAGE);
            } else{// Se puede crear nuevo cliente
                
                if( !modelCliente.getEmail().isEmpty() ){
                    clienteFields += ", email";
                    ValuesFields  += ", ?";
                }
                
                if( modelCliente.getContrasena()!=0 ){
                    clienteFields += ", contrasena";
                    ValuesFields  += ", ?";
                }
                
                if( !modelCliente.getCelular().isEmpty() ){
                    clienteFields += ", celular";
                    ValuesFields  += ", ?";
                }
                
                if( !modelCliente.getDob().isEmpty() ){
                    clienteFields += ", dob";
                    ValuesFields  += ", ?";
                }
                
                String create = "INSERT INTO cliente(" + clienteFields + ") VALUES (" + ValuesFields + ");";
                
                PreparedStatement statement = getConn().prepareStatement(create);
                
                statement.setString(1, modelCliente.getAlias());
                statement.setString(2, modelCliente.getNombres());
                statement.setString(3, modelCliente.getApellidos());
                
                if( !modelCliente.getEmail().isEmpty() ){
                    statement.setString(fieldCounter, modelCliente.getEmail());
                    fieldCounter++;
                }
                
                if( modelCliente.getContrasena()!=0 ){
                    statement.setInt(fieldCounter, modelCliente.getContrasena());
                    fieldCounter++;
                }
                
                if( !modelCliente.getCelular().isEmpty() ){
                    statement.setString(fieldCounter, modelCliente.getCelular());
                    fieldCounter++;
                }
                
                if( !modelCliente.getDob().isEmpty() ){
                    statement.setString(fieldCounter, modelCliente.getDob());
                } 
                
                int arrows = statement.executeUpdate();
                
                if (arrows > 0) 
                    JOptionPane.showMessageDialog(null, BikeShopParameters.CLIENTE_CREADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "No se crea nuevo Cliente", BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            }// Se puede crear nuevo cliente
        }//try
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }//catch
    }
    
    /**
     *
     * @param modelCliente
     * @return
     */
    public ArrayList<ModelCliente> searchCliente(ModelCliente modelCliente){
        ArrayList<ModelCliente> clientes = new ArrayList();
        
        try {
            setConn(ConnectionDB.getConnection());
            
            String operadorContrasena = (modelCliente.getContrasena() == 0)?">=":"=";
            
            String sql = "SELECT\n" + 
                    "alias, nombres, apellidos, email, contrasena, celular, dob\n" +
                    "FROM\n" +
                    "cliente\n" +
                    "WHERE\n" +
                    "alias LIKE ?\n" +
                    "AND nombres LIKE ?\n" +
                    "AND apellidos LIKE ?\n" +
                    "AND email LIKE ?\n" +
                    "AND contrasena " + operadorContrasena + " ?\n" +
                    "AND celular LIKE ?\n" +
                    "AND dob LIKE ?;";

            PreparedStatement preparedStatement = getConn().prepareStatement(sql);

            preparedStatement.setString(1, modelCliente.getAlias().trim());
            preparedStatement.setString(2, modelCliente.getNombres().trim());
            preparedStatement.setString(3, modelCliente.getApellidos().trim());
            preparedStatement.setString(4, modelCliente.getEmail().trim());
            preparedStatement.setInt(   5, modelCliente.getContrasena());
            preparedStatement.setString(6, modelCliente.getCelular().trim());
            preparedStatement.setString(7, modelCliente.getDob().trim());
            
            ResultSet SQLresult = preparedStatement.executeQuery();
            
            while(SQLresult.next()) {
                    String alias = SQLresult.getString(1);
                    String nombres = SQLresult.getString(2);
                    String apellidos = SQLresult.getString(3);
                    String email = SQLresult.getString(4);
                    int contrasena = SQLresult.getInt(5);
                    String celular = SQLresult.getString(6);
                    String dob = SQLresult.getString(7);

                    ModelCliente cliente = new ModelCliente(alias, nombres, apellidos, email, contrasena, celular, dob);
                    clientes.add(cliente);
                }

            if (clientes.isEmpty()) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.BUSQUEDA_VACIA, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
        }//try
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }//catch
        
        return clientes;
    }

    /**
     * 
     * @param cliente
     * @throws java.sql.SQLException 
     */
    public void updateCliente( ModelCliente cliente ) throws SQLException {
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "UPDATE cliente SET nombres=?, apellidos =?, email =?, contrasena =?, celular =?, dob =? WHERE alias=?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, cliente.getNombres().trim());
            statement.setString(2, cliente.getApellidos().trim());
            statement.setString(3, cliente.getEmail().trim());
            statement.setInt(4, cliente.getContrasena());
            statement.setString(5, cliente.getCelular().trim());
            statement.setString(6, cliente.getDob().trim());
            statement.setString(7, cliente.getAlias().trim());
            
            int rowsUpdated = statement.executeUpdate();
            
            if (rowsUpdated > 0) 
                JOptionPane.showMessageDialog(null, BikeShopParameters.CLIENTE_UPDATE, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
            //getConn().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }

    
    /**
     * 
     * @param cliente
     */
    public void deleteCliente(ModelCliente cliente){
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM cliente WHERE alias = ?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(0, cliente.getAlias());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.CLIENTE_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    /**
     *
     * @param alias
     */
    public void deleteClienteByAlias(String alias){
        try {
            setConn(ConnectionDB.getConnection());
            
            String sql = "DELETE FROM cliente WHERE alias = ?;";
            PreparedStatement statement = getConn().prepareStatement(sql);
            statement.setString(1, alias);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0)
                JOptionPane.showMessageDialog(null, BikeShopParameters.CLIENTE_BORRADO, BikeShopParameters.OP_OK, JOptionPane.INFORMATION_MESSAGE);
            
             //getConn().close();
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getMessage() + "\nError :" + ex.getMessage());
        }
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return this.conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
}