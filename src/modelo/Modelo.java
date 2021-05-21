/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.jdi.connect.spi.Connection;
import controlador.Controlador;
import modelo.Conexion;
/**
 *
 * @author gonza
 */
public class Modelo {

   
    Conexion con = new Conexion();
    Controlador controlador;
    String nombre;
    String apellido;
    String documento;
    char sexo;
    String fechaNac;
    
     public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public Conexion getCon() {
        return con;
    }

    public Controlador getControlador() {
        return controlador;
    }
    
    
    public Modelo(){
       
        
    }
    
    
}
