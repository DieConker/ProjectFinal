/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Usuario implements Serializable {
    public static final char tipoper = 'B';
    public static int secuenciador=0;
    private int id;
    private String usuario;
    private String password;
    private char tipo;
    private String carpeta;
    private String nameFile;

    public Usuario (String usuario, String password, char tipo) {
        secuenciador++;
        id=secuenciador;
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }

    public static int getSecuenciador() {
        return secuenciador;
    }

    public static void setSecuenciador(int secuenciador) {
        Usuario.secuenciador = secuenciador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario +
                ", password=" + password + ", tipo=" + tipo + ", carpeta=" + 
                carpeta + ", nombreFoto=" + nameFile + "}\n";
    }
    

    
    
    
    
    
    
}
