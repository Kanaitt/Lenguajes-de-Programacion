
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;


public class UsuarioBorrar {
    
     private Connection modificar_usuario = null;
    private PreparedStatement sentencias;
   
    public String [] borrarUsuariosBD(String name, String email, String cc, String position, String cell, String user, String pass) {
        try {

            modificar_usuario = Conexion.getConnection();
            sentencias = modificar_usuario.prepareStatement("DELETE FROM Usuarios WHERE Cedula = ?");
            sentencias.setString(1, cc);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
    
}
