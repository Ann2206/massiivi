package task6;

import java.util.Objects;
import java.util.Random;

public class task6 {
    public static void main( String[] args ) {

        int[][] array = new int[ 3 ][ 3 ];
        int i;
        int j;
        System.out.println ( "massiv 1" );
        Random rand = new Random ();
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[ i ].length; j++) {
                array[ i ][ j ] = rand.nextInt ( 15 );
                System.out.print ( " " + array[ i ][ j ] + " " );
            }
            System.out.println ();
        }
        System.out.println ( "Массив 2" );
        int[][] array2 = new int[ 3 ][ 3 ];
        for (i = 0; i < array2.length; i++) {
            for (j = 0; j < array2[ 0 ].length; j++) {
                array2[ i ][ j ] = rand.nextInt ( 15 );
                System.out.print ( " " + array2[ i ][ j ] + " " );
            }
            System.out.println ();
        }

        for (i = 0; i < array2.length; i++) {
            for (j = 0; j < array2[ 0 ].length; j++) {
                System.out.println (Objects.equals ( array[i][j], array2[i][j] ) );

            }
        }
    }
}