
package CONTROL;

import MODELO.Usuario;
import java.sql.*;

public class UsuarioDAO {
    
    //Cibsyktas SQL
    private static final String SELECT_USUARIO = "SELECT * FROM usuarios WHERE id = ?";
    private static final String SELECT_USUARIOU = "SELECT * FROM usuarios WHERE usuario = ?";
    private static final String INSERT_USUARIO = "INSERT INTO usuarios (usuario, password, tipo, carpeta, fileName) " 
            + "                        VALUES (?, ?, ?, ?,?)";
    
    private static final String UPDATE_USUARIO = 
            "UPDATE usuarios SET usuario = ?, password = ?, tipo = ?, carpeta = ?, nameFile= ? WHERE id = ?";
    private static final String DELETE_USUARIO = "DELETE_FROM usuarios WHERE id = ?";
    
    public Usuario obtenerUsuarioPorId (int id) {
        BasedeDatos bd = new BasedeDatos ();
        Connection conn= bd.getConnection();
        try (
            PreparedStatement stmt = conn.prepareStatement (SELECT_USUARIO)){
            stmt.setInt (1, id);
            try (
                    ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario (
                    rs.getString("usuario"),
                    rs.getString("password"),
                    rs.getString("tipo").charAt(0));
                    u.setId(rs.getInt("id"));
                    u.setCarpeta(rs.getString("carpeta"));
                    u.setNameFile(rs.getString("nameFIle"));
                    return u;   
                }
                
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Usuario obtenerUsuarioPorUser (String user) {
        BasedeDatos bd = new BasedeDatos ();
        Connection conn= bd.getConnection();
        try (
            PreparedStatement stmt = conn.prepareStatement (SELECT_USUARIOU)){
            stmt.setString(1, user);
            try (
                    ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario (
                    rs.getString("usuario"),
                    rs.getString("password"),
                    rs.getString("tipo").charAt(0));
                    u.setId(rs.getInt("id"));
                    u.setCarpeta(rs.getString("carpeta"));
                    u.setNameFile(rs.getString("nameFIle"));
                    return u;   
                }
                
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insertarUsuario(Usuario usuario) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        Statement stm = bd.getComando();
        
        try (
            PreparedStatement stmt = conn.prepareStatement(INSERT_USUARIO)) {
            
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getTipo()+"");
            stmt.setString(4, usuario.getCarpeta());
            stmt.setString(5, usuario.getNameFile());
            stmt.setInt(6, usuario.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
                e.printStackTrace();
                }
        return false;
    }
    
    public boolean actualizarUsuario(Usuario usuario) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn= bd.getConnection();
        
        try (
            PreparedStatement stmt = conn.prepareStatement(UPDATE_USUARIO)) {
            
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getTipo()+"");
            stmt.setString(4, usuario.getCarpeta());
            stmt.setString(5, usuario.getNameFile());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
                e.printStackTrace();
                }
        return false;
    }
    
    public boolean eliminarUsuario(int id){
        BasedeDatos bd = new BasedeDatos();
        Connection conn = bd.getConnection();
        
        try (
                PreparedStatement stmt = conn.prepareStatement(DELETE_USUARIO)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;                
    }
    
    public boolean encriptarPassUsuario (Usuario usuario) {
        BasedeDatos bd = new BasedeDatos();
        Connection conn = bd.getConnection();
        String UpdattePass = "Update usuarios SET password = ?   WHERE id = ?";
        try (
            PreparedStatement stmt = conn.prepareStatement(UpdattePass)) {
            String pass= usuario.getPassword();
            String passEnc = Seguridad.encriptar(pass);
            stmt.setString(1,passEnc);
            stmt.setInt(2, usuario.getId());return stmt.executeUpdate() > 0;
        } catch (Exception e) {
                e.printStackTrace();
                }
        return false;
    }
    
    public String obtenerPassUsuarioPortId (int id){
        BasedeDatos bd = new BasedeDatos();
        Connection conn = bd.getConnection();
        String r="";
        
        try (
                PreparedStatement stmt = conn.prepareStatement(SELECT_USUARIO)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                //String usuario, string password, char tipo
                if (rs.next()) {
                    r = rs.getString("password");
                    return r;
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main (String[] args) {
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.obtenerUsuarioPorId(1);
        System.out.println(u);
//        if(u!= null){
//            udao.encriptarPassUsuario(u);
//            System.out.println("SE ENCRIPTO");
//        }
    }
}
