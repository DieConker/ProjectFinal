
package CONTROL;

import java.sql.*;

public class BasedeDatos1 {
    
    public static void main (String[] args) {
        Connection connection = null;
        String catalog = null;
        String schemaPattern = null;
        String tableNamePattern = null;
        String[] types = null;
        String columnNamePattern = null;
        String procedureNamePattern = null;
        String functionNamePattern = null;
        
        try {
            //Crea una coneccion con la base de datos
            connection = DriverManager.getConnection("jdbc:sqlite:c:/temp/datos/datos.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);// Define el tiempo limite en 30 segundos
            catalog = connection.getCatalog();
            schemaPattern = connection.getSchema();
            //Se obtienen metadatos
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            
            //Datos generales
            System.out.println("\nDATOS GENERALES\n---------------------------");
            System.out.println("Productos: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Version: " + databaseMetaData.getDatabaseProductVersion());
            System.out.println("Usuario: " + databaseMetaData.getUserName());
            System.out.println("Producto name: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Driver: " + databaseMetaData.getDriverName());
            System.out.println("Version: " + databaseMetaData.getDriverVersion());
            System.out.println("U R L " + databaseMetaData.getURL());
            
            //Tablas
            System.out.println("\nTABLAS\n------------------------");
            tableNamePattern = "%";
            ResultSet rs = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern, types);
            while (rs.next()) {
                System.out.println("Tabla: '" +  rs.getString("TABLE_NAME") + "'");
            }
            
            //Columnas de una table
            System.out.println("\nCOLUMNAS DE TABLA 'Alumno'\n---------------------");
            tableNamePattern = "alumno";
            rs = databaseMetaData.getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern);
            while (rs.next()) {
                System.out.println("Colimna: '" + rs.getString("COLUMN_NAME")
                + "' de tipo: " + rs.getString("TYPE_NAME"));
            }
            
            //Procedimientos almacenados 
            System.out.println("\nPROCEDIMIENTOS ALMACENADOS\n------------------");
            procedureNamePattern = "%";
            rs = databaseMetaData.getProcedures(catalog, schemaPattern, procedureNamePattern);
            while (rs.next()) {
                System.out.println("Procedimiento: '" + rs.getString("PROCEDURE_NAME") 
                + "' de tipo: " + rs.getString("PROCEDURE_TYPE"));
            }
            //Donde TYPE_NAME:
            //0: Desconocido
            //1: Procedimiento
            //2: Funcion
            
            System.out.println("\nDATOS DE LA BASE DE DATOS DE USUARIOS \n-----------------------");
            
            rs = statement.executeQuery("select * from usuarios");
            while(rs.next()){
                //Lee el resultado escogido
                System.out.println("ID= " + rs.getString(1));
                System.out.println("USUARIO = " + rs.getString(2));
            }
            
            //Funciones
            System.out.println("\nFUNCIONES\n-----------------");
            functionNamePattern = "%";
            rs = databaseMetaData.getFunctions(catalog, schemaPattern, functionNamePattern);
            while (rs.next()) {
                System.out.println("Funcion: " + rs.getString("FUNCTION_NAME")
                + "' de tipo: " + rs.getString("FUNCTION_TYPE"));
                
            }
            System.out.println("FINALIZO PARTE 1");
            //Donde FUNCTION_ TYPE
            //0: No se puede determinar si se devolvera un valor devuelto o una tabla
            //1: Funcion no retorna tabla
            //2: Funcion retorna tabla
            
        } catch(SQLException e){
            // Si el mensaje de error es "out of memory"
            // Es probable que el archivo de la base de datos no haya sido encontrado
            System.out.println("eror " +e.getMessage());
        }
        
    }
    
}
