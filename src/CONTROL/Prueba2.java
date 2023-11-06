
package CONTROL;

import MODELO.*;


public class Prueba2 {
    
    public static void main (String[] args) {
        Persistencia per = new Persistencia();
        per.abrirArchivoEntrada();
        String password = "";
        String passEnc = "";
        Usuario u = null;
        
        try {
            u= (Usuario)per.cargar();
            passEnc = u.getPassword();
            password = Seguridad.desencriptar(passEnc);
            u.setPassword(password);
        } catch (Exception e){
            System.out.println("ERROR INESPERADO!!" + e);
        }
        per.cerrarArchivoEntrada();
        System.out.println(u);
    }
    
}
