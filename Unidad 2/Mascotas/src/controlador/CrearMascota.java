package controlador;

public class CrearMascota {
    
    public String [] Crear(String nombreMascota, String razaMascota, String edadMascota, String nombreDuenno, String telefono) {
        
        String[] objetoMascota = new String[5];
        
        objetoMascota[0] = nombreMascota;
        objetoMascota[1] = razaMascota;
        objetoMascota[2] = edadMascota;
        objetoMascota[3] = nombreDuenno;
        objetoMascota[4] = telefono;
        
        return objetoMascota;
        
        
    }
}
