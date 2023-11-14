
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
        } catch (Exception e) {
            System.out.println("error al ejecutar query\n" + e);
        }
    }
    
    public void ejecutarUpdate (String query){
        try{
            comando.executeQuery(query);
        } catch (Exception e) {
            System.out.println("error al ejecutar update\n" + e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getComando() {
        return comando;
    }

    public void setComando(Statement comando) {
        this.comando = comando;
    }

    public ResultSet getResultados() {
        return resultados;
    }

    public void setResultados(ResultSet resultados) {
        this.resultados = resultados;
    }
    
    public static void main (String[] args){
        BasedeDatos bd = new BasedeDatos();
        bd.ejecutarQuery("Select * from usuarios");
    }
    
}
