/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Carro;
import Modelo.Avion;


public class Principal {

    // Metodos
    /*public int sumar (int a, int b){
        return a+b;
    }
    
    static int restar (int num1, int num2){
        return num1 - num2;
    }
    
    static void hello (String name){
        System.err.println("Tu "+name+ " eres un error de la naturaleza" );
    }
    final double pi = 3.141516;
    static void nombre (){
        String n="Jose";
    }
    
    static int nomina(){
        int a = 5, b = 3, operation;
        operation = a*b;
        return operation;
    }
    
    static void dataanlytic(){
        if (nomina () >= 16){
            System.out.println("Si puedo ayudar");
        }else{
            System.out.println("No lo puedo ayudar");
        }
            
    }
    
    public double valorpi(){
        return pi;
    }
    */
    
    public static void main(String[] args) {
        
        Avion boing737 = new Avion ();
        
        boing737.pitar();
        boing737.turn_off();
        boing737.turn_on();
        
        
        /*Carro carrito = new Carro ("Chevrolet");
        
        /*Principal p= new Principal();
        nombre();
        dataanlytic();
        System.out.println("El valor de pi es: " +p.pi);
        
        
        Principal objeto = new Principal();
        System.out.println("El resultado de la suma es: "+objeto.sumar(10, 5)); //Me toco crear un objeto para llamarlo
        
        System.out.println("El resultado de la resta es: "+restar(10,5));//Para llamar un metodo dentro de otro sin llamarlo.
        
        //Llamada a metodo
        hello("Samuel");
        hello("Lucia");
        hello("patricia");
        
        // TODO code application logic here

        Carro pichirilo = new Carro();// Cree un objeto

        pichirilo.setMarca("Ford Fiesta");
        pichirilo.setModelo(2019);

        System.out.println("La marca del carro es "+ pichirilo.getMarca());
        
        System.out.println("Contacto : " +pichirilo.marlon(6000) );

        //Multiples Objetos
        Carro verdolaga = new Carro();
        verdolaga.setMarca("Chevrolet");
        verdolaga.setModelo(1974);
        System.out.println("LA marca del Carro es: "+ verdolaga.getMarca());
        System.out.println("El modelo del carro es : "+verdolaga.getModelo());
        
        //Modo Grafico
        
        JOptionPane.showMessageDialog(null,"El modelo es: " +verdolaga.getModelo());
        JOptionPane.showMessageDialog(null,"No salir", "Peligro", JOptionPane.WARNING_MESSAGE);
        String respuesta = JOptionPane.showInputDialog("Escriba tu nombre: ");
        */
    }

}
