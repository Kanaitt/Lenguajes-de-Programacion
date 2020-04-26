
package modelo;

public class Usuarios {
    
    private String Nombre;
    private String Correo;
    private String Cedula;
    private String Cargo;
    private String Telefono;
    private String Usuario;
    private String Contraseña;
    
    public Usuarios (String Nombre, String Correo, String Cedula,
            String Cargo, String Telefono, String Usuario, String Contraseña){
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Cedula = Cedula;
        this.Cargo = Cargo;
        this.Telefono = Telefono;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public Usuarios(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString(){
        return "Usuarios{ "+",Nombre = "+Nombre+
                ", Correo = "+Correo+", Cedula = "+Cedula+", Cargo = "+Cargo+
                ",Telefono = "+Telefono+", Usuario = "+Usuario+
                ", Contraseña = "+Contraseña+" }";
    }
}
