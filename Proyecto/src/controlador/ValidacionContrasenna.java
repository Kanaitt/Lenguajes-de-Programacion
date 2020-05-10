
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conexion;
import modelo.Usuarios;


public class ValidacionContrasenna {
    ArrayList<Usuarios> Lista_de_usuarios = new ArrayList<>();
    
    private Connection inicio_usuario = null;
    private PreparedStatement sentencias;
    private ResultSet resultados;
    private Usuarios usuarios;
    
    public ArrayList<Usuarios> obtenerListaUsuarios(){
        return Lista_de_usuarios;
    }
    
    public Usuarios cambiaContrasennaBD(String contrasenna, String cedula){
        try {
            inicio_usuario = Conexion.getConnection();
            sentencias = inicio_usuario.prepareStatement("UPDATE Usuarios SET Contraseña = ? WHERE Cedula = ?");
            sentencias.setString(1, contrasenna);
            sentencias.setString(2, cedula);
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
