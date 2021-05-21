/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author gonza
 */
public class Conexion {
    
    public final String url = "jdbc:mysql://localhost/SistemaHospital";
    public final String user = "root";
    public final String pass = "";
    
    
    public Connection Conectar(){
        
        Connection link = null;
    
        try {
            link = DriverManager.getConnection(this.url,this.user,this.pass);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "no se puede conectar a la base de datos");
            
        }
        
         return (link);
        
    }
   
}