package task9;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("vvedite chislo");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        double n = Math.sqrt(a);
        int[] arr = new int[a];

        while (i <= n) {
            if ( a % i == 0 ) {
                System.out.println("slozhnoye");
                break;
            }else {
                System.out.println("prostoye");
            }
            i++;
        }
    }
}