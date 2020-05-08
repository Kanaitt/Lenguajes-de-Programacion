package com.startm.Controlador;

import com.startm.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicaPersona {

    private List<Persona> listapersona; //estructura de datos

    public LogicaPersona() {
        this.listapersona = new ArrayList<>();
    }

    /**
     * fases del ciclo de vida del software = analisis, diseño, programacion,
     * puebas y mejora continua
     *
     * @author Eduardo
     * @param estudiante de tipo persona
     * @return true o false
     */
    public boolean registrarEstudiante(Persona estudiante) {
        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == estudiante.getCedula()) {
                return false;
            }
        }
        listapersona.add(estudiante);
        return true;
    }

    /**
     * Logica para imprimir la lista persona
     *
     * @author Eduardo
     * @return llistapersona
     */
    public List<Persona> listarestudiante() {
        return listapersona;
    }

    /**
     * Logica para buscar estudiantes por la cedula
     * @author Sebastian Rodriguez
     * @return true o false
     */
    public boolean buscarestudiantes() {

        System.out.println("Digite la cedula: ");
        Scanner sc = new Scanner(System.in);
        int cedula = sc.nextInt();

        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == cedula) {
                System.out.println("El estudiante es : ");
                System.out.println(listapersona.get(i).toString());
                return true;
            }
        }
        System.out.println("No hay estudiante registrado con esa cedula");
        return false;
    }
    
    /**
     * Logica para modificar estudiantes por la cedula
     * @author Sebastian Rodriguez
     * @return true o false
     */
    public boolean modificarEstudiante() {
        Persona estudiante = new Persona();
        System.out.println("***Se mostraran los estudiantes registrados***");
        for (int i = 0; i < listapersona.size(); i++) {
            System.out.println(listapersona.get(i).toString());
        }
        System.out.println("**********************************************");
        System.out.println("Digite la Cedula del estudiante que desea modificar");
        Scanner sc = new Scanner(System.in);
        int cedula = sc.nextInt();

        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == cedula) {
                
                estudiante.setCedula(cedula);

                System.out.println("Digite el Nombre");
                estudiante.setNombres(sc.next());

                System.out.println("Digite el Apellido");
                estudiante.setApellidos(sc.next());

                System.out.println("Digite la Edad");
                estudiante.setEdad(sc.nextInt());

                
                System.out.println("***Estudiante Modificado con Exito***");
                listapersona.set(i, estudiante);
                System.out.println(listapersona.get(i).toString());
                System.out.println("*************************************");
                return true;
            }
        }
        System.out.println("No hay estudiante registrado con esa cedula");
        return false;
    }
    
    /**
     * Logica para borrar estudiantes por la cedula
     * @author Sebastian Rodriguez
     * @return true o false
     */
    public boolean borrarEstudiante() {
        
        System.out.println("***Se mostraran los estudiantes registrados***");
        for (int i = 0; i < listapersona.size(); i++) {
            System.out.println(listapersona.get(i).toString());
        }
        System.out.println("**********************************************");
        System.out.println("Digite la Cedula del estudiante que desea Borrar");
        Scanner sc = new Scanner(System.in);
        int cedula = sc.nextInt();
        for (int i = 0; i < listapersona.size(); i++){
            if (listapersona.get(i).getCedula() == cedula) {
                listapersona.remove(i);
                System.out.println("Estudiante eliminado con exito");
                return true;
            }
        }
        System.out.println("No hay estudiante registrado con esa cedula");
        return false;
    }
}
