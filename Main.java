/*
        Este programa va a cambiar al azar la posicion de cada uno
        de los elementos de un array
 */
package alg_fisheryates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // para una cadena de caracteres se cambian el tipo de variable de int a cha
        // char[] A = {'a','b','c','d','e'};

        int[] A ={5,8,2,4,6,7};

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(A));
        System.out.println("Arreglo mezclado");
        aleatorio.shuffle(A);
    }
}