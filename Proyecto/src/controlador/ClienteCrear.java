
package controlador;

import modelo.Clientes;
import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;


public class ClienteCrear {
    
    ArrayList<Clientes> clientes_creados = new ArrayList<>();
    
    private Connection creacion_cliente = null;
    private PreparedStatement sentencias;
    private ResultSet resultados;
    private Clientes clientes;
    
    public ArrayList<Clientes> obtenerclientes(){
        return clientes_creados;
    }
    
    public Clientes crear_cliente(String Empresa, String Correo, String Representante,
            String Cargo, String Celular, String Direccion){
        try {
            creacion_cliente = Conexion.getConnection();
            sentencias = creacion_cliente.prepareStatement("INSERT INTO `Clientes` (Empresa, Correo, Representante, Cargo, Celular, Direccion )values (?,?,?,?,?,?)");
            sentencias.setString(1, Empresa);
            sentencias.setString(2, Correo);
            sentencias.setString(3, Representante);
            sentencias.setString(4, Cargo);
            sentencias.setString(5, Celular);
            sentencias.setString(6, Direccion);
            sentencias.executeUpdate();
            
            if (resultados != null){
                while (resultados.next()){
                    clientes = new Clientes();
                    clientes.setEmpresa(resultados.getString(1));
                    clientes.setCorreo(resultados.getString(2));
                    clientes.setRepresentante(resultados.getString(3));
                    clientes.setCargo(resultados.getString(4));
                    clientes.setCelular(resultados.getString(5));
                    clientes.setDireccion(resultados.getString(6));
                    
                    clientes_creados.add(clientes);
                    
                }
            }
            return clientes;
        }catch (SQLException e){
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());
            
        }
        return null;
    }
    
    
}
