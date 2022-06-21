package com.xpanxion.organzied;

public class ArrayProblem3 {
    public static void main(String[] args) {
        int[] a = {2,3,9,17,32,40,73,40,21,10};

        int temp = a[0];

        System.out.println("After shifting: ");

        for (int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("");

        System.out.println("After shifting: ");

        for (int i = 0; i< a.length; i++){
            if (i >= 0 && i < 9) {
                System.out.print(a[i + 1] + " ");
            }
        }
        System.out.print(temp);
    }
}
