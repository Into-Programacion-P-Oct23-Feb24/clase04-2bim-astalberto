/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // String miCiudad = obtenerCiudadMayuscula("Loja");
        // System.out.printf("%s\n", miCiudad);
        // System.out.println(obtenerMultiplicacion(5, 5));
        /**
         *  En la funcion obtenerMultiplicacion es una funcion void (No retorna
         * ningun valor) asi que al invocarlo el procedimiento realiza todo lo que
         * el codigo le indica
         * En cambio en obtenerMultiplicacionDos retorna un valor que es presentado
         * en una linea de codigo posterior
        **/
        obtenerMultiplicacion(7, 50);
        String miMensaje = obtenerMultiplicacionDos(7,50);
        System.out.println(miMensaje);
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }
    public static void obtenerMultiplicacion(int tabla, int limite) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        System.out.println(cadena);

    }
    
    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
