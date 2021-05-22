/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class ConsultaPaciente extends Conexion {
    
    public boolean Registrar(Paciente pro){
        JOptionPane.showConfirmDialog(null, "ingreso a registro");
        PreparedStatement stmt = null;
        Connection con = dameConexion();
        String sql = "INSERT INTO pacientes(documento,nombre,apellido,fechaNacimiento,sexo)"
        + "VALUES (?,?,?,?,?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setNString(1, pro.getDocumento());
            stmt.setString(2, pro.getNombre());
            stmt.setString(3, pro.getApellido());
            stmt.setString(4,pro.getFechaNac());
            stmt.setString(5, pro.getSexo());
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
