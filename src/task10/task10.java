package task10;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("vvedite chislo");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i ;
        int factorial =1;
        int[] arr = new int[a];
        for (i=1; i<=arr.length; i++){
            factorial=factorial* i;
        }
        System.out.println(factorial);
    }
}