package OOP;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;

    }
    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString() {
        String output = "(" + this.x + ", " + this.y + ")";
        return output;
    }
    public double distance(Point pnt){
        double result = 0;
        result = Math.sqrt((Math.pow(this.x - pnt.x, 2)) + (Math.pow(this.y - pnt.y, 2)));
        return result;
    }
}
