package OOP;

import com.xpanxion.organzied.Array;

public class SeperateDuplicates {
    public static void main(String[] args)
    {

      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));

    }

    public static String seperateDuplicatesChars(String s) {
        char c;
        String r ="";
        for(int i = 1; i <s.length() ; i++) {
            c = s.charAt(i-1);
            r = r+ c;
            if(s.charAt(i-1) == s.charAt(i)){
                r = r + "-";
            }

        }
        r = r+ s.charAt(s.length()-1);

        return r;
    }
}
