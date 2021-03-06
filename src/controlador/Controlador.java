/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.Paciente;
import modelo.ConsultaPaciente;
import vista.PantallaConsulta;
import vista.PantallaRegistro;
import vista.Principal;


/**
 *
 * @author gonza
 */
public class Controlador implements ActionListener {
    
    
    private Paciente pac;
    private ConsultaPaciente modC;
    private Principal visP;
    private PantallaRegistro pReg;
    private PantallaConsulta pCon;
    private PantallaRegistro visReg;
    private PantallaConsulta visCons;
    

    public Controlador(Paciente pac,ConsultaPaciente modC,Principal visP,PantallaConsulta visCon,
            PantallaRegistro visReg ) {
        
        this.pac = pac;
        this.modC= modC;
        this.visP = visP;
        this.visReg = visReg;
        this.visCons = visCon;
        this.visP.jMenuConsulta.addActionListener(this);
        this.visP.jMenuPaciente.addActionListener(this);
        this.visP.jMenuRegistrar.addActionListener(this);
        this.visReg.jbRegistrar.addActionListener(this);
        this.visCons.jbBuscar.addActionListener(this);
        
        
    }  
    
    public void iniciar (){

        visP.setTitle("Sistema de registro hospital");
        visP.setLocationRelativeTo(null); 
        visP.add (visReg);
        visP.add (visCons);
        visReg.setVisible(false);
        visCons.setVisible(false);
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
       //JOptionPane.showInternalMessageDialog(null, "ingreso");
       
       Object control = e.getSource();
       if (control.equals(visP.jMenuRegistrar) ) { // entra al menu Registrar
            
                      
           JOptionPane.showInternalMessageDialog(null, "ingreso a botn primero menu ");
           visReg.setVisible(true);
            
        
        }if (control.equals(visReg.jbRegistrar)){ // entra a registrar
            
            
            //JOptionPane.showInternalMessageDialog(null, "Apreto el boton guardar");
            
            // Obtengo los datos del Jcalendar para mandarlos como string
            String  year = Integer.toString(visReg.dcFechaNac.getCalendar().get(Calendar.YEAR));
            String  month = Integer.toString(visReg.dcFechaNac.getCalendar().get(Calendar.MONTH));
            String  day = Integer.toString(visReg.dcFechaNac.getCalendar().get(Calendar.DAY_OF_MONTH)); 
            String fecha = ""+year+"-"+""+month+"-"+""+day+"";
           
            //Segun sea el radioButtom seleccionado manda el string correspondiente
            char sexo;
             if (visReg.rbFemenino.isSelected()){
                sexo = 'F';
            }if (visReg.rbMasculino.isSelected()){
                sexo = 'M';
            }
            
            //Ingresa los datos en el objeto paciente
            pac.setFechaNac(fecha);
            pac.setDocumento(visReg.tfDocumento.getText());
            pac.setNombre(visReg.tfNombre.getText());
            pac.setApellido(visReg.tfApellido.getText());
           
            // Manda al nuevo paciente para su registro a la base de datos
            
            if (modC.Registrar(pac)){
                JOptionPane.showInternalMessageDialog(null, "Se guardo registro");
           
            }
            
        
        }
        
        
    }
    
  }
   