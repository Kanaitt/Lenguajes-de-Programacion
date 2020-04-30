
package controlador;

import modelo.Cotizacion;
import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;



public class CotizacionCrear {
    
    ArrayList<Cotizacion> cotizacion_creados = new ArrayList<>();
    
    private Connection creacion_cotizacion = null;
    private PreparedStatement sentencias;
    private ResultSet resultados;
    private Cotizacion cotizacion;
    
    public ArrayList<Cotizacion> obtenercotizacion(){
        return cotizacion_creados;
    }
    
    public Cotizacion crear_cotizacion(String IdEmpresa, String Proyecto, String FechaMontaje,
            String FechaActividad, String Ciudad, String Pago, String FechaElaboracion,
            String Cedula, String Observacion){
        try {
            creacion_cotizacion = Conexion.getConnection();
            sentencias = creacion_cotizacion.prepareStatement("INSERT INTO `Cotizacion`(IdEmpresa, Proyecto, FechaMontaje, FechaActividad, Ciudad, Pago, FechaElaboracion, Cedula, Observacion )values (?,?,?,?,?,?,?,?,?)");
            sentencias.setString(1, IdEmpresa);
            sentencias.setString(2, Proyecto);
            sentencias.setString(3, FechaMontaje);
            sentencias.setString(4, FechaActividad);
            sentencias.setString(5, Ciudad);
            sentencias.setString(6, Pago);
            sentencias.setString(7, FechaElaboracion);
            sentencias.setString(8, Cedula);
            sentencias.setString(9, Observacion);
            sentencias.executeUpdate();
            
            if (resultados != null){
                while (resultados.next()){
                    cotizacion = new Cotizacion();
                    cotizacion.setIdEmpresa(resultados.getInt(1));
                    cotizacion.setProyecto(resultados.getString(2));
                    cotizacion.setFechaMontaje(resultados.getString(3));
                    cotizacion.setFechaActividad(resultados.getString(4));
                    cotizacion.setCiudad(resultados.getString(5));
                    cotizacion.setPago(resultados.getString(6));
                    cotizacion.setFechaElaboracion(resultados.getString(7));
                    cotizacion.setCedula(resultados.getString(8));
                    cotizacion.setObservacion(resultados.getString(9));
                    
                    cotizacion_creados.add(cotizacion);
                    
                }
            }
            return cotizacion;
        }catch (SQLException e){
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());
            
        }
        return null;
    }
}
