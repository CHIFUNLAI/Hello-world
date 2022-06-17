package com.xpanxion.organzied;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        int sum = 0;
        System.out.print("Enter an integer n: ");

        n = scan.nextInt();

        for (int i = 1; i <=n; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of all even numbers between 1 and " + n + " is "  + sum);

    }
}
