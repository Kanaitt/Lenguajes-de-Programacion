
package controlador;

import modelo.Usuarios;
import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class UsuarioCrear {
    
    ArrayList<Usuarios> usuarios_creados = new ArrayList<>();
    
    private Connection creacion_usuario = null;
    private PreparedStatement sentencias;
    private ResultSet resultados;
    private Usuarios usuarios;
    
    public ArrayList<Usuarios> obtenerusuarios(){
        return usuarios_creados;
    }
    
    public Usuarios crear_usuario(String name, String email, String cc, String position, String cell, String user, String pass){
        try {
            creacion_usuario = Conexion.getConnection();
            sentencias = creacion_usuario.prepareStatement("INSERT INTO `Usuarios` (Nombre, Correo, Cedula, Cargo, Telefono, Usuario, Contraseña )values (?,?,?,?,?,?,?)");
            sentencias.setString(1, name);
            sentencias.setString(2, email);
            sentencias.setString(3, cc);
            sentencias.setString(4, position);
            sentencias.setString(5, cell);
            sentencias.setString(6, user);
            sentencias.setString(7, pass);
            sentencias.executeUpdate();
            
            if (resultados != null){
                while (resultados.next()){
                    usuarios = new Usuarios();
                    usuarios.setNombre(resultados.getString(1));
                    usuarios.setCorreo(resultados.getString(2));
                    usuarios.setCedula(resultados.getString(3));
                    usuarios.setCargo(resultados.getString(4));
                    usuarios.setTelefono(resultados.getString(5));
                    usuarios.setUsuario(resultados.getString(6));
                    usuarios.setContrasenna(resultados.getString(7));
                    
                    usuarios_creados.add(usuarios);
                    
                }
            }
            return usuarios;
        }catch (SQLException e){
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());
            
        }
        return null;
    }
    
}
