
package CONTROL;

import MODELO.*;


public class Prueba {
    
    public static void main (String[] args) {
        Persistencia per = new Persistencia ();
        per.abrirArchivoSalida();
        String password = "The99Diego";
        
        try {
            String passEnc = Seguridad.encriptar(password);
            Usuario u = new Usuario("dguapacha", passEnc, 'S');
            u.setCarpeta("C:\\temp\\images\\Users\\"+u.getUsuario()+"\\");
            u.setNameFile(u.getUsuario()+".jpg");
            per.guardar(u);
        } catch (Exception e){
            System.out.println("ERROR INESPERADO!!"+e);
        }
        
        per.cerrarArchivoSalida();
    }
    
}
