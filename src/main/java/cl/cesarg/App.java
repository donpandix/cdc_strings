package cl.cesarg;

/**
 * Implementación de los casos de prueba del libro Cracking The Code
 * particularmente del capítulo 1
 *
 * @author  Cesar Gonzalez       @donpandix
 * @version v.20190109
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // resolución del primer problema
        String cadena_prueba = "abcdefghijklmnopqrstuvwxyza";

        System.out.println( "El retorno del primer problema (a) es : " + Resultados.problema_01_a(cadena_prueba) );
        System.out.println( "El retorno del primer problema (b) es : " + Resultados.problema_01_b(cadena_prueba) );
        System.out.println( "El retorno del primer problema (c) es : " + Resultados.problema_01_c(cadena_prueba) );


    }
}
