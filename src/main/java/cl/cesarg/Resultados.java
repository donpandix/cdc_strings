package cl.cesarg;

import java.util.Stack;

/**
 * Clase que implementa las funciones que solucionan los ejercicios
 * propuestos por este capítulo
 *
 *
 */
public class Resultados {

    /**
     * Valida caracter único en una cadena
     * Complejidad O(n)
     * @param entrada
     * @return
     */
    public static boolean problema_01_a ( String entrada ) {
        int[] cadena = new int[256];
        for ( int n=0 ; n<entrada.length() ; n++ ) {
            int ascii = entrada.charAt(n);
            if (cadena[ascii] == -1) {
                return false;
            }
            cadena[ascii] = -1;
        }
        return true;
    }

    /**
     * Valida unicidad del caracter recorriendo el arreglo 2 veces
     * complejidad O(n^2)
     * @param entrada
     * @return
     */
    public static boolean problema_01_b (String entrada) {
        for (int n=0 ; n < entrada.length() ; n++) {
            for (int m = n+1 ; m < entrada.length(); m++) {
                if (entrada.charAt(n) == entrada.charAt(m)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verificación de unicidad de caracteres con ordenamiento del arreglo
     * y luego de comparación de caracteres contiguos
     * Complejidad O(n^2)
     * @param entrada
     * @return
     */
    public static boolean problema_01_c (String entrada) {
        // Ordenamiento del arreglo

        int n = entrada.length();

        // Ordenamiento por Bubble Sort O(n^2)
        // DEBE SER CAMBIADO POR QUICK SORT!!! O(n log n)
        for (int a=0 ; a < n ; a++) {
            for (int b=1; b<(n-a) ; b++) {
                if (entrada.charAt(b-1) > entrada.charAt(b) ) {
                    String x = entrada.substring(b-1, b);
                    String y = entrada.substring(b, b+1);
                    entrada  = entrada.substring(0, b-1) + y + x + entrada.substring(b+1);
                }
            }
        }

        // Comparación O(n)
        for (int z=0 ; z<(n-1) ; z++ ) {
            if (entrada.charAt(z) == entrada.charAt(z+1)) {
                return false;
            }
        }
        return true;
    }





    /**
     * Reversa una cadena de n caracteres con un NULL al final
     * Complejidad O(2n)
     * @param cadena carecteres de entrada
     * @return cadena reversada
     */
    public static String problema_02_a ( String cadena ) {
        StringBuilder retorno = new StringBuilder();
        for (int n=(cadena.length()); n>0; n--) {
            retorno.append(cadena.substring(n-1, n));
        }
        return retorno.toString();
    }

    /**
     * Resultado implementado con stack se generan más loops
     * de los necesarios, Complejidad O(2n)
     * @param cadena
     * @return
     */
    public static String problema_02_b (String cadena) {
        Stack retorno = new Stack();
        String respuesta = "";
        for (int n=0; n<cadena.length(); n++) {
            retorno.push(cadena.substring(n,n+1));
        }
        while (retorno.size() > 0) {
            respuesta += retorno.pop();
        }
        return respuesta;
    }






}
