
package Modelo;

/*
*Java Inheritance
*SuperClass
*@author Sebastian Rodriguez
*/

public class Vehiculo { //moto, carro, bote, carro electrico, bus, avion
    String dueno;
    int modelo;
    String marca;
    int precio;
    
    public void pitar (){
        System.out.println("Tu Tuuuuu");
    }
    
    public void turn_on(){
        System.out.println("Turn on");
    }
    
    public void turn_off(){
        System.out.println("Turn of");
    }
}
