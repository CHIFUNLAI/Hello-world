package Inher_Poly;

public class Shape {
    boolean isFilled = true;
    String color;

    public Shape(){
        this.color = "green";
    }
    public Shape(boolean a, String b){
        this.isFilled = a;
        this.color = b;
    }
    public String toString(){
        return("Filled:" + this.isFilled + "\n" + "color" + this.color);
    }


}

