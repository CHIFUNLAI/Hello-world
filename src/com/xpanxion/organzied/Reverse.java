package OOP;


public class Reverse {
    public static void main(String[] args) {
        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));

    }
    public static boolean isExactReverse(String s, String d){
        boolean b = false;
        char c;
        String r ="";
        for(int i = 0; i <s.length() ; i++){
            c = s.charAt(i);
            r = c+r;
        }
        if(r.equals(d)){
            b = true;
            return b;
        }
        else{
            return b;
        }
    }
}