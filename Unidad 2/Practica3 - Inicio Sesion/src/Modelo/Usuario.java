
package Modelo;

import java.util.Date;

public class Usuario {
    
    private int IDusuario;
    private String Nombre;
    private String Apellido;
    private String Nickname;
    private String Contraseña;
    private String Correo;
    private Date Fecha_nacimiento;
    private int Nivel;
    private int Rol;
    
    public Usuario (int IDusuario, String Nombre, String Apellido, 
            String Nickname, String Contraseña, String Correo, 
            Date Fecha_nacimiento, int Nivel, int Rol){
        this.IDusuario = IDusuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nickname = Nickname;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Nivel = Nivel;
        this.Rol = Rol;
             
    }
    public Usuario (){
        
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Constraseña) {
        this.Contraseña = Constraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }
    
    /*
    ToString
    Metodo que me sirve para mostrar la informacion de un objeto de manera 
    completa , osea los atributos
    */
    
    @Override
    public String toString(){
        return "Usuario{ "+ " IDusuario = "+ IDusuario + 
                ", Nombre = " + Nombre + 
                ", Apellido = " + Apellido +
                ", Nickname = " + Nickname +
                ", Contraseña = " + Contraseña +
                ", Correo = " + Correo +
                ", Fecha_Nacimiento = " + Fecha_nacimiento + 
                ", Nivel = " + Nivel + 
                ", Rol = " + Rol + "}";
                
    }
}
