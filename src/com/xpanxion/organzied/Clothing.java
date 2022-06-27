package OOP;

public class Clothing {
    Double price;
    String type;
    String size;


    public Clothing(){
        price = 29.9;
        type = "T-Shirt";
        size = "Medium";
    }

    public Clothing(Double p, String t, String s){
        price = p;
        type = t;
        size = s;
    }
    public void increasePrice(){
        price = price + 5;


    }

    public void increasePrice(Double x){
        price = price + x;
    }

    public void details(){
        System.out.println("type: " + type);
        System.out.println("size: "+ size);
        System.out.println("Price: $" + price);
        System.out.println("");
    }


}
