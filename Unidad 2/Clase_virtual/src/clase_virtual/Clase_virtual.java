/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_virtual;

import java.util.Scanner;

/**
 *
 * @author prodr
 */
public class Clase_virtual {

    public static void main(String[] args) {
        //Matriz Magica
        //1. Creamos matriz magica
        int[][] matriz = new int[3][3];

        // System.out.println("Tamaño Filas: "+ matriz.length);
        //System.out.println("Tamaño columna: " + matriz[0].length);
        //2. LLenamos
        Scanner leer = new Scanner(System.in);
        System.out.println("*******ADIVINA SI TU MATRIZ ES MAGICA*******");
        System.out.println("Por favor ingresa los valores de la matriz: ");
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                matriz[filas][columnas] = leer.nextInt();
            }
        }
        int fila1 = 0;
        for (int i = 0; i < 3; i++) {
            fila1 += matriz[0][i];
        }
        int fila2 = 0;
        for (int i = 0; i < 3; i++) {
            fila2 += matriz[1][i];
        }
        int fila3 = 0;
        for (int i = 0; i < 3; i++) {
            fila3 += matriz[2][i];
        }
        int col1 = 0;
        for (int i = 0; i < 3; i++) {
            col1 += matriz[i][0];
        }
        int col2 = 0;
        for (int i = 0; i < 3; i++) {
            col2 += matriz[i][1];
        }
        int col3 = 0;
        for (int i = 0; i < 3; i++) {
            col3 += matriz[i][2];
        }
        int diag = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (f == c) diag += matriz[f][c];
            }
        }
        int diag2 = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (f+c == 2) diag2 += matriz[f][c];
            }
        }
        
        //Validar si da 15
        if (fila1 == 15 && fila2 == 15 && fila3 == 15 &&
                col1 == 15 && col2 == 15 && col3 == 15 && diag == 15 && diag2 ==15 ){
            System.out.println("Si es magica");
        }
        else {
            System.out.println("No es magica");
        }
            

        for (int x = 0;
                x < 3; x++) {
            System.out.print("|");
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
}
