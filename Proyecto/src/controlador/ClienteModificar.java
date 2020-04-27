
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;

public class ClienteModificar {
    
    private Connection modificar_cliente = null;
    private PreparedStatement sentencias;
   
    public String [] modificarClienteBD(String idEmpresa, String empresa, String correo, String representante, String cargo, String celular, String direccion) {
        try {

            modificar_cliente = Conexion.getConnection();
            sentencias = modificar_cliente.prepareStatement("UPDATE Clientes SET idEmpresa = ?, Empresa = ?, Correo = ?, Representante = ?, Cargo = ?, Celular = ?, Direccion = ? WHERE IdEmpresa = ?");
            sentencias.setString(1, idEmpresa);
            sentencias.setString(2, empresa);
            sentencias.setString(3, correo);
            sentencias.setString(4, representante);
            sentencias.setString(5, cargo);
            sentencias.setString(6, celular);
            sentencias.setString(7, direccion);
            sentencias.setString(8, idEmpresa);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
           
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
    
}
