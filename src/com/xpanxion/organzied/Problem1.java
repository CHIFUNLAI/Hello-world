package com.xpanxion.organzied;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.print("Enter an integer x: ");

        n = scan.nextInt();

        for (int i = 1; i <=n; i++){
            if ((i % 3 == 0) &&(i % 2 == 1)){
                System.out.println(i + " is multiple of 3");
            }
        }
    }
}

