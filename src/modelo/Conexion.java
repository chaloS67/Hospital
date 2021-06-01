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
    
    public final String driver ="com.mysql.cj.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/SistemaHospital";
    public final String user = "root";
    public final String pass = "";
    Connection miConexion = null;   
    
    
    public Conexion(){
        
        try {
            Class.forName(driver);
           miConexion = DriverManager.getConnection(this.url,this.user,this.pass);
           if (miConexion != null){
               JOptionPane.showInternalMessageDialog(null, "Conexion establecida");
           }
            
        } catch (SQLException  | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "no se puede conectar a la base de datos");
        }
    }
    
    public Connection getConnection(){
        
        return miConexion;
    }
   
}
