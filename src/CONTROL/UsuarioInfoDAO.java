package CONTROL;

import MODELO.*;
import java.sql.*;

public class UsuarioInfoDAO {
    
    
    //Consultas SQL
    private static final String SELECT_USUARIO_INFO = "SELECT * FROM usuariosinfo WHERE id = ?";
    private static final String INSERT_USUARIO_INFO = "INSERT INTO usuariosinfo (id, name, apellido, sexo, email, edad, tipo, carpeta) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_USUARIO_INFO = "UPDATE usuariosinfo SET name = ?, apellido = ?, sexo = ?, edad = ?, email = ?, edad = ?, tipo = ?, carpeta = ? WHERE id = ?";
    private static final String DELETE_USUARIO_INFO = "DELETE FROM usuariosinfo WHERE id = ?";
    
    public UsuarioInfo obtenerUsuarioInfoPorId(int id){
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(SELECT_USUARIO_INFO)){
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next ()) {
                    return new UsuarioInfo (
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("apellido"),
                    rs.getString("sexo").charAt(0),
                    rs.getString("email"),
                    rs.getInt("edad"),
                    rs.getString("tipo").charAt(0),
                    rs.getString("carpeta"));
                
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insertarUsuarioInfo(UsuarioInfo usuarioInfo) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(INSERT_USUARIO_INFO)) {
            stmt.setInt(1, usuarioInfo.getId());
            stmt.setString(2, usuarioInfo.getName());
            stmt.setString(3, usuarioInfo.getApellido());
            stmt.setString(4, usuarioInfo.getSexo() +"");
            stmt.setString(5, usuarioInfo.getEmail());
            stmt.setInt(6, usuarioInfo.getEdad());
            stmt.setString(7, usuarioInfo.getTipo() + "");
            stmt.setString(8, usuarioInfo.getCarpeta());
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean actualizarUsuarioInfo(UsuarioInfo usuarioInfo) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(UPDATE_USUARIO_INFO)) {
            stmt.setInt(1, usuarioInfo.getId());
            stmt.setString(2, usuarioInfo.getName());
            stmt.setString(3, usuarioInfo.getApellido());
            stmt.setString(4, usuarioInfo.getSexo() +"");
            stmt.setString(5, usuarioInfo.getEmail());
            stmt.setInt(6, usuarioInfo.getEdad());
            stmt.setString(7, usuarioInfo.getTipo() + "");
            stmt.setString(8, usuarioInfo.getCarpeta());
            return stmt.executeUpdate() > 0;        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }    
    
    public boolean eliminarUsuarioInfo(int id) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(DELETE_USUARIO_INFO)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;     
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
        UsuarioInfoDAO udaoinfo = new UsuarioInfoDAO ();
        UsuarioInfo ui = udaoinfo.obtenerUsuarioInfoPorId(1);
        System.out.println(ui);
    }
    
}
