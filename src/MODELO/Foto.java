
package MODELO;


public class Foto {
    private int id;
    private String nombreFoto;
    private String comenObs;
    private char tipoFoto;

    public Foto(int id, String nombreFoto, String comenObs, char tipoFoto) {
        this.id = id;
        this.nombreFoto = nombreFoto;
        this.comenObs = comenObs;
        this.tipoFoto = tipoFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public String getComenObs() {
        return comenObs;
    }

    public void setComenObs(String comenObs) {
        this.comenObs = comenObs;
    }

    public char getTipoFoto() {
        return tipoFoto;
    }

    public void setTipoFoto(char tipoFoto) {
        this.tipoFoto = tipoFoto;
    }

    @Override
    public String toString() {
        return "Foto{" + "id=" + id + ", nombreFoto=" + nombreFoto + ", comenObs=" + comenObs + ", tipoFoto=" + tipoFoto + "}\n";
    }
    
    
    
}
