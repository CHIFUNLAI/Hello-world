package Inher_Poly;

public class Circle extends Shape {
    double radius;


    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double radius, boolean a, String b) {
        this.radius = radius;
        this.isFilled = a;
        this.color = b;
    }

    public double getArea(){
        return (radius * radius * 3.1415926);
    }


    public String toString(){
        return("Radius: " + radius + "\n" + "Area: " + getArea()+ "\n"+ "Filled: " + this.isFilled + "\n" + "color: " + this.color);
    }


}
