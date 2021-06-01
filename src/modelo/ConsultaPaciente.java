/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class ConsultaPaciente extends Conexion {
    
    public boolean Registrar(Paciente pac){
        
        
        PreparedStatement stmt = null;
        Connection con = getConnection();
        String sql = "INSERT INTO pacientes (documento,nombre,apellido,fechaNacimiento,sexo)"
        +"VALUES (?,?,?,?,?)";
     
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pac.getDocumento());
            stmt.setString(2, pac.getNombre());
            stmt.setString(3, pac.getApellido());
            stmt.setString(4, pac.getFechaNac());
            stmt.setString(5, pac.getSexo());
            stmt.executeUpdate();
            return true;
          
        }catch (SQLException e){
            
            System.err.println(e);
            return false;
   
        }finally{
        
            try {
               
                con.close();
                
            } catch (SQLException ex) {
               
                System.err.println(ex);
            }
        }
       
    }
   
    
}
