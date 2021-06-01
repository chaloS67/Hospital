/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import controlador.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.PantallaRegistro;

/**
 *
 * @author gonza
 */
public class Paciente {

   
    
    private String nombre;
    private String apellido;
    private String documento;
    private String sexo;
    private String fechaNac;
    
    
    
    public Paciente(){
    
        nombre = "";
        apellido= "";
        documento= "";
        sexo = "";
        fechaNac = "";

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

    public void setSexo(String sexo) {
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

    public String getSexo() {
        return sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }
    
   
}
