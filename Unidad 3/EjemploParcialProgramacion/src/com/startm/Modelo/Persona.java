
package com.startm.Modelo;

import java.util.List;

public class Persona {
    //Modifiers Public,Protected, private, Default
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private List <Persona> propiedades;
    /*
    Constructor para inicializar los valores de un objeto de la clase
    persona.    
    Persona objeto1 = new Persona();
    */
    public Persona(){
        this.cedula = 1;
        this.nombres= "";
        this.apellidos= "";
        this.edad= 1;
    }
    /*
    Contructor para obligar que cuando se cree un objeto de la clase persona
    tenga como minimo lo siguiente.
    Persona Object = new Persona(2,"pepe","Rodriguez","12")
    */
    public Persona (int cedula,String nombres,String apellidos,int edad){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    public Persona (int cedula){
        this.cedula=cedula;
    }
    
    // Get y Set de los atributos de la clase

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula_que_llega) {
        this.cedula = cedula_que_llega;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Persona> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Persona> propiedades) {
        this.propiedades = propiedades;
    }
    
    //Clase especial que me sirve para imprimir bonita la clase

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad +'}';
    }

    
}
