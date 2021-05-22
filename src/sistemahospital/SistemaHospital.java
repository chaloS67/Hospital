/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospital;

import controlador.Controlador;
import modelo.ConsultaPaciente;
import modelo.Paciente;
import vista.PantallaConsulta;
import vista.PantallaRegistro;
import vista.Principal;


/**
 *
 * @author gonza
 */
public class SistemaHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Paciente miModelo = new Paciente();
       Principal miPrincipal = new Principal(); 
       PantallaRegistro miReg = new PantallaRegistro();
       PantallaConsulta miPantallaConsulta = new PantallaConsulta();
       ConsultaPaciente miConsul = new ConsultaPaciente();
       Controlador ctrl = new Controlador(miModelo,miConsul,miPrincipal,miPantallaConsulta,miReg);
       ctrl.iniciar();
     
      
       miPrincipal.setVisible(true);
        
        
       
    }
    
}   
