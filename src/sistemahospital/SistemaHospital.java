/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospital;

import controlador.Controlador;
import modelo.Modelo;
import vista.Principal;
import modelo.Conexion;

/**
 *
 * @author gonza
 */
public class SistemaHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Modelo miModelo = new Modelo();
       Principal miPrincipal = new Principal(); 
       Controlador miControlador = new Controlador(miPrincipal,miModelo);
       miPrincipal.setControlador(miControlador);
       miModelo.setControlador(miControlador);
       miModelo.getCon();
      
       miPrincipal.setVisible(true);
        
        
       
    }
    
}   
