package com.xpanxion.organzied;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double z;

        System.out.println("Enter for x: "  );
        x = scan.nextDouble();
        System.out.println("Enter for y: " );
        y = scan.nextDouble();
        System.out.println("Enter for z: " );
        z = scan.nextDouble();

        if ((x < y) && (y < z)){
            System.out.println("INCREASING");
        }
        else if ((x > y) && (y > z)){

            System.out.println("DECREASING");
        }
        else {
            System.out.println("NEITHER");
        }
    }
}
