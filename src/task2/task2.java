package task2;

import java.util.Random;

public class task2 {
    public static void main( String[] args ) {
        Random rand = new Random ();
        int[] array = new int[ 100 ];
        int i;
        int counter = 0;
        for (i = 0; i < array.length; counter++) {
            if ( counter % 13 == 0 || counter % 17 == 0 ) {
                array[i]=counter;
                System.out.println ( array[ i ] + " " );
                i++;
            }
        }
    }
}