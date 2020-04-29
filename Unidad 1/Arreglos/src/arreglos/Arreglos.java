package arreglos;

import java.util.Scanner;
import javax.swing.*;

/**
 * Sebastian Rodiguez
 * Haciendo Arreglos y Menus
 */
public class Arreglos extends JFrame{
    private JLabel label1;
    
    public Arreglos(){
        setLayout(null);
        label1 = new JLabel("prueba");
        label1.setBounds(10,20,300,30);
        add(label1);
    }
    public static void main(String[] args) {
        /*Arreglos arreglo_1 = new Arreglos();
        arreglo_1.setBounds(0,0,550,300);//tamaño y ubicacion
        arreglo_1.setVisible(true);//visibilidad de la interfaz
        arreglo_1.setLocationRelativeTo(null);//aparezca en el centro
        arreglo_1.setResizable(false);//Modificar el tamaño de la interfaz*/
        Scanner entrada = new Scanner(System.in);
        int  elementos_a_ingresar;
        
        elementos_a_ingresar = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de palabras que va a almacenar"));
         
        String [] palabras = new String[elementos_a_ingresar];
        
        System.out.println("\n usted va a igresar " + elementos_a_ingresar + " elementos");
        System.out.println("Comenzaremos a digitalizar las palabras");
        for (int i = 0; i < elementos_a_ingresar; i++){
            System.out.println((i+1)+ " :" );
            String val = entrada.next();
            palabras[i] = val;
        }
        System.out.println("\n Las palabras del arreglo son: ");
        for (int i = 0; i < elementos_a_ingresar; i++){
            System.out.println((i+1)+". "+ palabras[i]);
            }
        System.out.println("\n Que acciones desea realizar : ");
        System.out.println("\n 1.Borrar \n 2.Modificar \n escoja una opcion:");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Escogiste la opcion de borrar un elemento");
                System.out.println("ingrese el numero del elemento que quiere borrar");
                for (int i = 0; i < elementos_a_ingresar; i++){
                System.out.println((i+1)+". "+ palabras[i]);
                }
                int eleccion = entrada.nextInt();
                for (int i = 0; i < elementos_a_ingresar; i++){
                    if (eleccion-1 == i) {
                        palabras[i] = "";
                    }
                    else {
                    }
                }
                System.out.println("\n El arreglo a quedado de esta manera:");
                for (int i = 0; i < elementos_a_ingresar; i++){
                System.out.println((i+1)+". "+ palabras[i]);
                }
                break;   
            case 2:
                System.out.println("Escogiste la ocpcion de modificar un elemento");
                System.out.println("Ingrese el numero del elemento que desea modificar");
                for (int i = 0; i < elementos_a_ingresar; i++){
                System.out.println((i+1)+". "+ palabras[i]);
                }
                int eleccion_2 = entrada.nextInt();
                for (int i = 0; i < elementos_a_ingresar; i++){
                    if (eleccion_2-1 == i) {
                        System.out.println("\nIngrese la nueva palabra");
                        String val = entrada.next();
                        palabras[i] = val;
                    }
                    else {
                    }
                }
                System.out.println("\n El arreglo a quedado de esta manera:");
                for (int i = 0; i < elementos_a_ingresar; i++){
                System.out.println((i+1)+". "+ palabras[i]);
                }
                
                break;
            default:
                System.out.println("No escogiste una opcion correcta");break;
            }
        }
    }


    

