package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;


public class UsuarioModificar {

    private Connection modificar_usuario = null;
    private PreparedStatement sentencias;
   
    public String [] modificarUsuariosBD(String name, String email, String cc, String position, String cell, String user, String pass) {
        try {

            modificar_usuario = Conexion.getConnection();
            sentencias = modificar_usuario.prepareStatement("UPDATE Usuarios SET Nombre = ?, Correo = ?, Cedula = ?, Cargo = ?, Telefono = ?, Usuario = ?, Contraseña = ? WHERE Cedula = ?");
            sentencias.setString(1, name);
            sentencias.setString(2, email);
            sentencias.setString(3, cc);
            sentencias.setString(4, position);
            sentencias.setString(5, cell);
            sentencias.setString(6, user);
            sentencias.setString(7, pass);
            sentencias.setString(8, cc);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
           
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
}
