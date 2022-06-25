package com.xpanxion.organzied;
import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows:");
        int row = scan.nextInt();
        System.out.println("Enter columns:");
        int col = scan.nextInt();
        int[][] a = new int[row][col];

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] = scan.nextInt();
            }
        }
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(isRowMagic(a));
    }

    public static boolean isRowMagic(int[][] arr) {
        int sum1 = 0;
        for (int r = 0; r < 1; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                sum1 += arr[r][c];
            }
        }
        boolean isEqual = true;
        int[] sum = new int[arr.length];

        for (int row = 0; row < arr.length; row++)
        {

            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
                sum[row] += arr[row][col];
            }

            System.out.println();
            System.out.println(sum[row]);

            if (sum[row] != sum[0])
            {
                isEqual = false;
            }

        }

        return isEqual;
    }
}


