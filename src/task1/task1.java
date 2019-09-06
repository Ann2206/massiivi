package task1;

public class task1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 6, 8, 9, 7};


        for ( int i = 0; i < array.length; i++)
            System.out.println ( array[i]+ " " );
        for ( int j = array.length -1; j < array.length; j--)
            System.out.println ( array[j]+ " " );
    }
}