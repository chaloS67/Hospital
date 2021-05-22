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

    public Controlador(Paciente pac,ConsultaPaciente modC,Principal visP,PantallaConsulta pCon,
            PantallaRegistro pReg) {
        
        this.pac = pac;
        this.modC= modC;
        this.visP = visP;
        this.pCon = pCon;
        this.pReg = pReg;
        this.visP.jMenuConsulta.addActionListener(this);
        this.visP.jMenuPaciente.addActionListener(this);
        this.visP.jMenuRegistrar.addActionListener(this);
//        this.visReg.jbRegistrar.addActionListener(this);
//       this.visCons.jbBuscar.addActionListener(this);
        
    }  
    
    public void iniciar (){

        visP.setTitle("Sistema de registro hospital");
        visP.setLocationRelativeTo(null);
        


    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == pReg.jbRegistrar){
           // sisisisissi
            int  year = visReg.dcFechaNac.getCalendar().get(Calendar.YEAR);
            int  month = visReg.dcFechaNac.getCalendar().get(Calendar.MONTH);
            int  day = visReg.dcFechaNac.getCalendar().get(Calendar.DAY_OF_MONTH); 
            String fecha = ""+year+"-"+""+month+"-"+""+day+"";

            pac.setDocumento(visReg.tfDocumento.getText());
            pac.setNombre(visReg.tfNombre.getText());
            pac.setApellido(visReg.tfApellido.getText());
            pac.setFechaNac(fecha);
            
            if (modC.Registrar(pac) == true){
                JOptionPane.showInternalMessageDialog(null, "Se ingreso correctamente");
            }else{
            
                JOptionPane.showInternalMessageDialog(null, "no ingreso archivo");
            }
        }
        
        
    }
    
    
    
    
}
