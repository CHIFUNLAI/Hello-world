package Inher_Poly;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, boolean a, String b){
        this.width = width;
        this.length = length;
        this.isFilled = a;
        this.color = b;
    }
    public void setLW(){
        double c = 0.0;
        while(this.length < this.width){
            c = this.length;
            this.length = this.width;
            this.width = c;
        }
    }
    public double getArea(){
        return (this.length * this.width);
    }
    public String toString(){
        setLW();
        return("Width: " + width + "\n" + "length: "+ length + "\n" + "Area: " + getArea()+ "\n"+ "Filled: " + this.isFilled + "\n" + "color: " + this.color);
    }

}
