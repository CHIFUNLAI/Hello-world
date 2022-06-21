package com.xpanxion.organzied;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;

        while (n < 1 || n >20 ){
            System.out.print("Enter an integer between 1 and 20: ");
            n = scan.nextInt();
        }
        int[] arrayA = new int[n];

        int base = 2;
        int power = 0;
        int result = 1;

        System.out.println(1);

        while (power < n -1){
            result = result * base;
            arrayA[power] = result;
            System.out.println(arrayA[power]);
            power++;
        }
    }
}
