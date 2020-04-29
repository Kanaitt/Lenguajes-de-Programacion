package taller_1;

/*  Escribe un programa que dada una matriz de 3x3 realice las siguientes funciones:
• Calcule la media de todos los valores
• Calcule el valor mínimo y el máximo de todos los valores
• Sumar los valores en la diagonal descendente.
• Sumar los valores en la diagonal ascendente.
• Sumar los valores que están por encima de la diagonal descendente.
• Sumar los valores que están por debajo de la diagonal descendente.
• Probarlo con la matriz [ [1,2,3], [4,5,6], [7,8,9] ]
 */
public class Taller_1 {

    public static void main(String args[]) {
        int[][] arreglo_2d = {{1,2,4},{4,5,6},{7,8,9}};
        int suma = 0;
        int media = 0;
        int max = 0;
        int min = 1;
        int descendente = 0;
        int ascendente = 0;
        int encima = 0;
        int debajo = 0;
        for (int i = 0; i < arreglo_2d.length; i++) {
            for (int j = 0; j < arreglo_2d.length; j++) {
                suma += arreglo_2d[i][j];
                if (arreglo_2d[i][j] >= max ) max = arreglo_2d[i][j];
                
                if (arreglo_2d[i][j] <= min ) min = arreglo_2d[i][j];
                
                if ( i == j) descendente += arreglo_2d[i][j];
                
                if (i < j) encima += arreglo_2d[i][j];
                
                if (i > j) debajo += arreglo_2d[i][j];
            }
        }
        for (int c = 2; c >= 0; c--){
            for (int f = 2; f >= 0; f-- ){
                if (c == f) {
                    ascendente += arreglo_2d[c][f];
                }
            }
        }
        for (int x = 0; x < arreglo_2d.length; x++) {
            System.out.print("|");
            for (int y = 0; y < arreglo_2d[x].length; y++) {
                System.out.print(arreglo_2d[x][y]);
                if (y != arreglo_2d[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        media = suma/(arreglo_2d.length*arreglo_2d.length);
        System.out.println("La media es: "+media);
        System.out.println("El valro maximo es: "+max);
        System.out.println("El valor minimo es: "+min);
        System.out.println("La suma de la diagonal descendente es: "+descendente);
        System.out.println("La suma ascendente es: "+ascendente);
        System.out.println("La suma de los numeros que estan por encima de la diagonal es: "+encima);
        System.out.println("La suma de los numeros que estan por debajo de la diagonal es: "+debajo);
    }
}
