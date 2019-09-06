package task5;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int i;
        int j;
        int[][] array = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        char[][] sim = new char[5][5];
        for (i=0; i<array.length; i++){
            sim[i] = Arrays.toString(array[i]).toCharArray();
        }

        for (i = 0; i < sim.length; i++) {
            for (j = 0; j < sim[i].length; j++) {
                if ( sim[i][j] == '1') {
                    sim[i][j] = '*';
                }else if ( sim[i][j] == '0' )
                    sim[i][j] = ' ';
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(sim[i]);
        }
    }
}
