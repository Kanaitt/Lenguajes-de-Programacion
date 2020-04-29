package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogicaUsuario {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private Connection katsu = null;
    private PreparedStatement sentencias;
    private ResultSet rs;
    private Usuario usuario; //para relacionar la clase logica(Controlador) con la clase usuario (Modelo)

    public ArrayList<Usuario> obtenerListaUsuarios() {
        return listaUsuarios;

    }

    /*
    Logica Iniciar Sesion
     */
    public Usuario iniciarSesion(String user, String pass) {
        try {
            katsu = Conexion.getConnection();
            sentencias = katsu.prepareStatement("Select * From usuario where Nickname = ? AND Contraseña = ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            rs = sentencias.executeQuery();//metodo a ejecutar la sentencia de la DB
            

            if (rs != null) {
                while (rs.next()) {
                    usuario = new Usuario();
                    usuario.setIDusuario(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setApellido(rs.getString(3));
                    usuario.setNickname(rs.getString(4));
                    usuario.setContraseña(rs.getString(5));
                    usuario.setCorreo(rs.getString(6));
                    usuario.setFecha_nacimiento(rs.getDate(7));
                    usuario.setNivel(rs.getInt(8));
                    usuario.setRol(rs.getInt(9));

                    listaUsuarios.add(usuario); //En mi lista queda cargada toda la informacion

                }
            }
            return usuario;

        } catch (SQLException e) {
            System.out.println("Error en la consulta de la Base de Datos: " + e.getMessage());

        }
        return null;
    }
}
