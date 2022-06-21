package com.xpanxion.organzied;
import java.util.Scanner;
public class ArrayProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n <= 0 ){
            System.out.print("Enter an integer greater than 10: ");
            n = scan.nextInt();
        }
        int arrayA[] = new int[n];
        for(int i = 0; i < arrayA.length; i++ ){
            arrayA[i] = scan.nextInt();
        }
        System.out.print("You entered: ");
        for (int r = 0; r< arrayA.length; r++ ){
            System.out.print(arrayA[r]+ " ");
        }
        int max = 0;
        int min = 0;

        for (int r = 0; r < arrayA.length; r++){
            while(arrayA[r]  > max) {
                max = arrayA[r];
            }
        }
        System.out.println("");
        System.out.println("Max: "+ max);

        for (int r = 0; r < arrayA.length; r++){
            while(arrayA[r]  < max) {
                max = arrayA[r];
                min = max;
            }
        }
        System.out.println("Min: "+ min);

        int sum = 0;
        for (int r = 0; r < arrayA.length; r++){
            sum +=arrayA[r];
        }
        double average = (double)sum/n;
        System.out.println("Average: " + average);

        System.out.println("Elements greater than average: ");
        for (int r = 0; r < arrayA.length; r++){
            if(arrayA[r] > average){
                System.out.print(arrayA[r]+ " ");
            }
        }
        System.out.println("");
        System.out.println("Elements greater than 2: ");
        for (int r = 0; r < arrayA.length; r++){
            if(arrayA[r] > 2){
                System.out.print(arrayA[r] + " ");
            }
        }
        System.out.println("");

        int []arrayB = new int[n];
        int j = n;
        for (int r = 0; r < n; r++){
            arrayB[n-1] = arrayA[r];
            j = j-1;
        }
        System.out.println("Array in reverse order: ");
        for (int r = 0; r< arrayB.length; r++ ){
            System.out.print(arrayB[r]+ " ");
        }
    }
}
