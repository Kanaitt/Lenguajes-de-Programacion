
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    
    static Connection c = null;
    public static final String URL = "jdbc:mysql://localhost:3306/LSE";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "admin";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver"); // llamo la libreria
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("conexion a base de datos exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se conecto a la base de datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
        return c;
        
    }
    
    public static void desconectarBD(){
        try {
            if (c != null){
                c.commit();
                c.close();
            }
            c = null;
        } catch (SQLException e){
            e.printStackTrace();//Pista de la excepcion que salga
        }
    }
    
    public static void desconectarSentencia (PreparedStatement sentencia) throws SQLException {
        if (sentencia != null){
            sentencia.close ();
        }
        sentencia = null;
    }
}
