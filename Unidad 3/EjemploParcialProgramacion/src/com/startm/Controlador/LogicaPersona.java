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

    public boolean buscarestudiantes() {

        System.out.println("Digite la cedula: ");
        Scanner sc = new Scanner(System.in);
        int cedula = sc.nextInt();

        for (int i = 0; i < listapersona.size(); i++) {

            if (cedula == listapersona.get(i).getCedula()) {
                System.out.println("El estudiante es : ");
                System.out.println(listapersona.get(i).toString());
                return true;
            } else {
                System.out.println("No hay estudiante registrado con esa cedula");
                return false;

            }
        }
        return false;
    }

}
