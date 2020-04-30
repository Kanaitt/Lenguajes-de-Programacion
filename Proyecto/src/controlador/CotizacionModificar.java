
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;

public class CotizacionModificar {
    
    private Connection modificar_cotizacion = null;
    private PreparedStatement sentencias;
   
    public String [] modificarCotizacionBD(String Proyecto, String FechaMontaje,
            String FechaActividad, String Ciudad, String Pago, String FechaElaboracion,
            String Observacion, String Idcotizacion, String IdCotizacion) {
        try {

            modificar_cotizacion = Conexion.getConnection();
            sentencias = modificar_cotizacion.prepareStatement("UPDATE Cotizacion SET Proyecto = ?, FechaMontaje = ?, FechaActividad = ?, Ciudad = ?, Pago = ?, FechaElaboracion = ?, Observacion = ? WHERE IdCotizacion = ?");
            sentencias.setString(1, Proyecto);
            sentencias.setString(2, FechaMontaje);
            sentencias.setString(3, FechaActividad);
            sentencias.setString(4, Ciudad);
            sentencias.setString(5, Pago);
            sentencias.setString(6, FechaElaboracion);
            sentencias.setString(7, Observacion);
            sentencias.setString(8, IdCotizacion);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
           
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
    }
    
}
