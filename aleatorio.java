package alg_fisheryates;

import java.util.Arrays;
import java.util.Random;
public class aleatorio {
    private static void swap(int[] A, int i, int j) {
        /*
            Intercambia los elementos
         */
        int temp = A [i];
        System.out.println("num que se  mueve= " + temp);
        A[i] = A[j];
        A[j] = temp;

    }
    public static void  shuffle (int[] A){
        for( int i =A.length -1; i>=0 ;i--){
             //System.out.println("\t nuevo ingreso a for");
             //System.out.println("i= "+i);

            Random rand = new Random(); // crea objet de la clase Random
            int j= rand.nextInt(i + 1);   // elige al azar un num
                                                // entre 0 y el rango del array +1

            System.out.println("j= "+j);
            swap(A, i,j);
            System.out.println(Arrays.toString(A));
        }
        //System.out.println(Arrays.toString(A));
    }
}
