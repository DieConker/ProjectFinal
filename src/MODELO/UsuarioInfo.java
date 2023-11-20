
package MODELO;


public class UsuarioInfo {
    private int id;
    private String name;
    private String apellido;
    private char sexo;
    private String email;
    private int edad;
    private char tipo;
    private String carpeta;

    public UsuarioInfo(int id, String name, String apellido, char sexo, String email, int edad, char tipo, String carpeta) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.sexo = sexo;
        this.email = email;
        this.edad = edad;
        this.tipo = tipo;
        this.carpeta = carpeta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    @Override
    public String toString() {
        return "UsuarioInfo{" + "id=" + id + ", name=" + name + ", apellido=" + apellido + ", sexo=" + sexo + ", email=" + email + ", edad=" + edad + ", tipo=" + tipo + ", carpeta=" + carpeta + "}\n";
    }
    
    
    
}
