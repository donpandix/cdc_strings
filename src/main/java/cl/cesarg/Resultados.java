package cl.cesarg;

/**
 * Clase que implementa las funciones que solucionan los ejercicios
 * propuestos por este capítulo
 *
 *
 */
public class Resultados {

    /**
     * Valida caracter único en una cadena
     */
    public static boolean problema_01 ( String entrada ) {
        int[] cadena = new int[255];

        for ( int n=0 ; n<entrada.length() ; n++ ) {
            int ascii = entrada.charAt(n);
            if (cadena[ascii] == -1) {
                return false;
            }
            cadena[ascii] = -1;
        }

        return true;
    }




}
