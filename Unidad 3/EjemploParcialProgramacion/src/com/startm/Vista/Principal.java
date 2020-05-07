package com.startm.Vista;

import com.startm.Controlador.LogicaPersona;
import java.util.Scanner;


public class Principal {
    
    //RELACIONES
    private Menu menu;
    private LogicaPersona logica;
    
    public  Principal (){
        this.menu = new Menu(this);
        this.logica = new LogicaPersona();
    }
    
    public Menu getMenu(){
        return menu;
    }
    
    public LogicaPersona getLogica(){
        return logica;
    }
    
    public static void main(String[] args){
        Principal principal = new Principal();
        
        //Saltos para movernos entre clases
        principal.getMenu().mostrarMenuPrincipal();
        
        /*Scanner lec = new Scanner(System.in);
        int num1 = lec.nextInt();
        int num2 = lec.nextInt();
        
        int mul = num1*num2;
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Multi es = " +mul);
            contador = contador+2;
        }*/
            
        
    }
    
   
    
}
