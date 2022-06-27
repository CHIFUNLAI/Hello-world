package OOP;

public class TestClothing {
    public static void main(String[] args) {
        Clothing cloth1 = new Clothing();
        cloth1.details();
        cloth1.increasePrice();
        cloth1.details();
        cloth1.increasePrice(7.0);
        cloth1.details();

        Clothing cloth2 = new Clothing(31.2,"Jeans","Small");
        cloth2.details();
        cloth2.increasePrice(10.0);
        cloth2.details();
        cloth2.increasePrice(4.0);
        cloth2.details();

    }

}
