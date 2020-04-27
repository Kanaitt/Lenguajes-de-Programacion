
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;

public class ClienteBorrar {
    
    private Connection borrar_cliente = null;
    private PreparedStatement sentencias;
   
    public String [] borrarClienteBD(String idEmpresa, String empresa, String correo, String representante, String cargo, String celular, String direccion) {
        try {

            borrar_cliente = Conexion.getConnection();
            sentencias = borrar_cliente.prepareStatement("DELETE FROM Clientes WHERE IdEmpresa = ?");
            sentencias.setString(1, idEmpresa);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
    
}
