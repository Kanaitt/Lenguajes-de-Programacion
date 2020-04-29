/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Persona;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bienvenido a mi programa");

        //instanciar o crear un objeto de la clase
        Persona objetoMaria = new Persona();
        objetoMaria.setName("Maria Camila");
        objetoMaria.setEmail("asdhahsk@hotmail.com");
        objetoMaria.setEdad(20);
        
        System.out.println("Ella es "+ objetoMaria.getName() +" su email es " + objetoMaria.getEmail()+ " y tiene " + objetoMaria.getEdad()+ " años");
       

    }

}
