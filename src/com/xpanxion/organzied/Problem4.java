package com.xpanxion.organzied;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int digit = 0;
        int sum = 0;
        System.out.print("Enter an integer n: ");
        n = scan.nextInt();

        while(n > 0){
            digit = n % 10;
            sum+= digit;
            n = n/10;
        }
        System.out.print("The sum of all digits of " + n + " is: " + sum);
    }

}
