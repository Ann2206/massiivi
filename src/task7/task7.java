package task7;

import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        String[] mast = new String[4];
        mast[0] = "Hearts";
        mast[1] = "Spades";
        mast[2] = "Clubs";
        mast[3] = "Diamonds";

        String[] number = new String[13];
        number[0] = "Two";
        number[1] = "Three";
        number[2] = "Four";
        number[3] = "Five";
        number[4] = "Six";
        number[5] = "Seven";
        number[6] = "Eight";
        number[7] = "Nine";
        number[8] = "Ten";
        number[9] = "Jack";
        number[10] = "Queen";
        number[11] = "King";
        number[12] = "Ace";
        n = number.length * mast.length;
        String[] karta = new String[n];
        for (i=0; i<mast.length; i++){
            for (j=0; j<number.length; j++){
                karta[mast.length*i + j] = number[j] + "of" + mast[i];
            }
        }

        Random generator = new Random ();
        int randomIndex = generator.nextInt (karta.length);
        System.out.println (karta[randomIndex] );



    }
}

