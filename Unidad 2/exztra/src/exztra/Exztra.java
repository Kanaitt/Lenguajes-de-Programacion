
package exztra;

import java.util.Scanner;

public class Exztra {

    static int diviidento = 20;
    static int divisor = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite su edad");
        int edad = lector.nextInt();
        System.out.println("su edad es "+edad);
        
        try {
            int resultado = diviidento / divisor;
        System.out.println("El resultado de la division es " + resultado);
        
        } catch (ArithmeticException error){
            System.out.println("No se puede dividir entre cero");
        }
        
    }
    
}
