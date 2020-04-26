package controlador;

import modelo.Usuarios;
import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Validacion { 
    
    ArrayList<Usuarios> Lista_de_usuarios = new ArrayList<>();
    
    private Connection inicio_usuario = null;
    private PreparedStatement sentencias;
    private ResultSet resultados;
    private Usuarios usuarios;
    
    public ArrayList<Usuarios> obtenerListaUsuarios(){
        return Lista_de_usuarios;
    }
    
    public Usuarios iniciar_sesion(String user, String pass){
        try {
            inicio_usuario = Conexion.getConnection();
            sentencias = inicio_usuario.prepareStatement("Select * From Usuarios Where Usuario = ? AND Contraseña = ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            resultados = sentencias.executeQuery();
            
            if (resultados != null){
                while (resultados.next()){
                    usuarios = new Usuarios();
                    usuarios.setNombre(resultados.getString(1));
                    usuarios.setCorreo(resultados.getString(2));
                    usuarios.setCedula(resultados.getString(3));
                    usuarios.setCargo(resultados.getString(4));
                    usuarios.setTelefono(resultados.getString(5));
                    usuarios.setUsuario(resultados.getString(6));
                    usuarios.setContraseña(resultados.getString(7));
                    
                    Lista_de_usuarios.add(usuarios);
                    
                }
            }
            return usuarios;
        }catch (SQLException e){
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());
            
        }
        return null;
    }
}
