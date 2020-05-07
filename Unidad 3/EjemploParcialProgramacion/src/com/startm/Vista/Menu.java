
package com.startm.Vista;

import com.startm.Modelo.Persona;
import java.util.Scanner;

public class Menu {
    
    //RELACIONES
    public Principal principal;
    public Scanner lector;
    
    //CONSTRUCTORA
    public Menu(Principal principal){
        this.principal=principal;
        this.lector = new Scanner(System.in);
    }
    
    public void mostrarMenuPrincipal (){
        int opcion = -1;
        do{
            System.out.println("Bienvenido al colegio San Pedro Claver IED");
            System.out.println("1. Gestion de personas");
            System.out.println("2. Gestion de eventos");
            System.out.println("3. Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    mostrarSubMenuClientes();
                    break;
                case 2:
                    //mostrarSubMenuEventos(); Para un Futuro
                    break;
                case 3:
                    opcion=0;
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                            
            }
        }while (opcion != 0);
    }
    
    public void mostrarSubMenuClientes(){
        int opcion = -1;
        do{
            System.out.println("MODULO 1. GESTION DE PERSONAS");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiates por cedula");
            System.out.println("4. Modificar estudiantes");
            System.out.println("5. Eliminar estudiantes");
            System.out.println("6. Regresar al menu principal");
            opcion = lector.nextInt();
            
            switch (opcion){
                case 1:
                    registrarEstudiantes();
                    break;
                case 2:
                    //listarEstudiantes();
                    break;
                case 3:
                    //buscarEstuiantes();
                    break;  
                case 4:
                    //modificarEstudiantes();
                    break;
                case 5:
                    //eliminarEstudiantes();
                    break;
                case 6:
                    opcion =0;
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0); 
        
    }
    
    public void registrarEstudiantes(){
        Persona estudiante = new Persona();
        
        System.out.println("Digite Cedula");
        estudiante.setCedula(lector.nextInt());
        
        System.out.println("Digite el Nombre");
        estudiante.setNombres(lector.next());
        
        System.out.println("Digite el Apellido");
        estudiante.setApellidos(lector.next());
        
        System.out.println("Digite la Edad");
        estudiante.setEdad(lector.nextInt());
        
        //Conectar con la logica
        
        if (principal.getLogica().registrarEstudiante(estudiante)){
            System.out.println("Estudiante Registrado con exito");
        }else{
            System.out.println("Estudiante no se registro");
        }
        
    }
    
}
