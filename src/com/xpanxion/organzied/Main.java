package com.xpanxion.organzied;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int count = 1;
        while(n <= 1){
            System.out.println("Enter an integer n greater than 1: ");
            n = scan.nextInt();
        }
        while(count <= n){
            if((n % count) == 0){
                sum+= count;
                count++;
            }
            else {
                count++;
            }

        }
        System.out.println(sum);
        System.out.println("The sum of all factors of " + n + " is " + sum);
    }
}

