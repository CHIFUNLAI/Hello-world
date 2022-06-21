package com.xpanxion.organzied;
import java.util.Scanner;
public class ArrayProblem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while(n< 10){
            System.out.print("Enter integer n greater than 10: ");
            n = scan.nextInt();

        }
        int[] a = new int[n];
        Scanner scan2 = new Scanner(System.in);
        for(int i = 0; i < a.length; i++ ){
            a[i] = scan2.nextInt();
        }
        System.out.println("Before swap: ");
        for (int r = 0; r< a.length; r++ ){
            System.out.print(a[r]+ " ");
        }
        System.out.println("");
        int sum1 = 0;
        for (int r = 0; r< a.length; r++ ){
            sum1 = a[2]+a[5]+a[7]+a[9];
        }
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is:" + sum1);

        int temp = a[2];
        a[2] = a[6];
        a[6] = temp;

        int temp2 = a[4];
        a[4] = a[7];
        a[7] = temp2;
        for (int r = 0; r< a.length; r++ ){
            System.out.print(a[r]+ " ");
        }
        System.out.println("");
        int sum2 = 0;
        for (int r = 0; r< a.length; r++ ){
            sum2 = a[2]+a[5]+a[7]+a[9];
        }
        System.out.println("Sum of elements at indexes 2, 5, 7 and 9 is:" + sum2);






    }
}
