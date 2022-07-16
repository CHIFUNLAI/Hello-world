package Except_Abstract;
import java.io.*;
import java.util.*;

public class MaximumOfEachLine {
    public static void main(String[] args) {
        File f =new File("C:\\Users\\ChiSio\\IdeaProjects\\First Project\\src\\Except_Abstract\\data.txt");

        try{
            Scanner scan = new Scanner(f);

            while(scan.hasNext()){
                String s =scan.nextLine();
                String sr = s.replace(",", " ");
                String[] sp = sr.split(" ");
                int max = 0;
                for(int i = 2; i< sp.length; i++){
                    if((Integer.parseInt(sp[i]) > max )){
                        max = (Integer.parseInt(sp[i]));
                    }
                }
                System.out.println(sp[0] + " " + sp[1] + "  " + "Max: " + max);

            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found.");
        }
    }

}
