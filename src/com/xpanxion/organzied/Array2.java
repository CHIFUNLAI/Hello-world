package com.xpanxion.organzied;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = 0;



        while (n < 1 || n > 20) {
            System.out.print("Enter an integer between 1 and 20: ");
            n = scanner.nextInt();

        }

        int[] arr = new int[n];


        for (int x = 0; x < arr.length; x++) {

            arr[x]= (int)Math.pow(2,x);

            System.out.println(arr[x]);

        }

    }

}