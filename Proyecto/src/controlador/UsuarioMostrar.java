
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Usuarios;


public class UsuarioMostrar {
    
   /* private final String SQL_SELECT = "SELECT * FROM `Usuarios`";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS;
    private final Conexion CN;
    
    public UsuarioMostrar(){
        PS = null;
        CN = new Conexion();
    }
    private DefaultTableModel setTitulos(){
        DT = new DefaultTableModel();
        DT.addColumn("Nombre");
        DT.addColumn("Correo");
        DT.addColumn("Cedula");
        DT.addColumn("Cargo");
        DT.addColumn("Telefono");
        DT.addColumn("Usuario");
        DT.addColumn("Contraseña");
        return DT;
    }
    
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            
            Object[] fila = new Object[7];
            while (RS.next()){
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getString(6);
                fila[6] = RS.getString(7);
                DT.addRow(fila);
            }
        } catch (SQLException e){
            System.out.println("Error en la lista de la base de datos " + e.getMessage());
        } finally { //Liberar recursos
            PS = null;
            RS = null;   
        }
        return DT;
    
    }
*/
    
}
