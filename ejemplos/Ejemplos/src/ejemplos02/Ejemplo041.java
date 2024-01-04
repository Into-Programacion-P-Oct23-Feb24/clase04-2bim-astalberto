/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] ar1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] ar2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arR = new int[3][3];
        int primerValor = 0;
        int segundoValor = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                primerValor = ar1[i][j];
                segundoValor = ar2[i][j];
                arR[i][j] = obtenerMultiplicacion(primerValor, segundoValor);
            }
        }
        System.out.println("Tabla 1");
        presentacion(ar1);
        System.out.println("Tabla 2");
        presentacion(ar2);
        System.out.println("Tabla 3");
        presentacion(arR);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int mult;
        mult = a * b;
        return mult;
    }

    public static void presentacion(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
