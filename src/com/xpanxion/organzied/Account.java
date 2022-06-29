package OOP;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name){
        this.id =id;
        this.name = name;

    }
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }
    public String getId(){
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }
    public void credit(double amount){
        this.balance = this.balance + amount;
    }
    public boolean debit(double amount){
        boolean b = false;
        if(amount > this.balance){
            System.out.println("Amount exceeded");
            return b;

        }
        else{
            b = true;
            this.balance = this.balance - amount;
            return b;
        }
    }
    public void transferTo(Account another, double amount){
        if(amount > this.balance){
            System.out.println("Amount exceeded");

        }
        else{
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
            System.out.println("Transfer completed");
        }
    }
    public String accountDetails(){
        return(this.name +", the current balance in your account " + this.id + " is $" + this.balance);

    }

}

