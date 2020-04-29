
package Modelo;

public class Carro {
    private String marca;
    private int modelo;
    
    /*
    Constructor
    Unico metodo que va en mayuscula
    unico metodo que no tiene salida
    Special method = used to initialize objects
    1 or more 
    the constructor is called when an objet of class is created
    */
    
    public Carro(String m){
        this.marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public boolean marlon (int valor){
        boolean ayuda = true;
        if (valor >= 5000) {
            System.out.println("Si lo ayudo");
            ayuda = true;
        }
        else {
            System.out.println("No lo ayudo");
            ayuda = false;
        }
        return ayuda;
    }
    
    
    
}
