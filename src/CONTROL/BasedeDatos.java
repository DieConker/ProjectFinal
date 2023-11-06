
package CONTROL;

import java.sql.*;


public class BasedeDatos {
    private Connection connection ;
    private Statement comando ;
    private ResultSet resultados;
    
    public BasedeDatos(){
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:c:/temp/datos/datos.db");
            comando = connection.createStatement();
            System.out.println("Conectado y Statement creada");
        } catch (Exception e) {
            System.err.println("Error en coneccion \n" +e);
        }
    }
    
    public void ejecutarQuery (String query){
        try{
            resultados = comando.executeQuery(query);
            while(resultados.next()){
                System.out.println(resultados.getInt("ID"));
                System.out.println(resultados.getString("USUARIO"));
                System.out.println(resultados.getString("PASSWORD"));
                System.out.println(resultados.getString("CARPETA"));
                System.out.println(resultados.getString("nameFile"));
                System.out.println(resultados.getString("TIPO"));
            }
        } catch (Exception e) {
            System.out.println("error al ejecutar query\n" + e);
        }
    }
    
    public static void main (String[] args){
        BasedeDatos bd = new BasedeDatos();
        bd.ejecutarQuery("Select * from usuarios");
    }
    
}
