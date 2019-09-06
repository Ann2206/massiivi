package task4;

import java.util.Random;

public class task4 {

    public static void main( String[] args ) {
        Random rand = new Random ();
        int[] array = new int[ 3 ];
        int i;
        for (i = 0; i < array.length; i++) {
            array[ i ] = rand.nextInt ( 89 ) + 10;
            System.out.println ( array[ i ] );
        }
        for (i = 0; i < array.length; i++) {
            if ( array[ 0 ] < array[ 1 ] && array[ 1 ] < array[ 2 ] ) {
                System.out.println ( "Последовательность возрастающая" );
            }else {
                if ( array[ 0 ] > array[ 1 ] && array[ 1 ] > array[ 2 ] ) {
                    System.out.println ( "Последовательност убывающая" );
                }else {
                    System.out.println ( "Последовательность не является ни возрастающей, ни убывающей" );
                }
                break;
            }
        }
    }
}