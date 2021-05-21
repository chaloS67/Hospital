/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Principal;

/**
 *
 * @author gonza
 */
public class Controlador implements ActionListener {
    
    private Principal principal;
    private Modelo modelo;

    public Controlador(Principal principal , Modelo modelo) {
        
        this.principal = principal;
        this.modelo = modelo;
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
    
    
    
}
