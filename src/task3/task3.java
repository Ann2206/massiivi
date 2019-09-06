package task3;

public class task3 {
    public static void main( String[] args ) {
        int[] array = {1, 3, 0, 5, 9, 6, 4};
        int i;

        int m;
        int sum = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for (i = 0; i < array.length; i++) {
            if ( array[ i ] < array[minIndex] ) {
                minIndex = i ;
            }
            if ( array[ i ] > array[maxIndex] ) {
                maxIndex =  i ;
            }
        }
        System.out.println ( array[minIndex] );
        System.out.println ( array[maxIndex] );

        for (i = minIndex + 1; i< maxIndex; i++) {
            sum =sum + array[ i ];
            i++;

            System.out.println ( "Сумма=" + sum );
        }
    }
}

