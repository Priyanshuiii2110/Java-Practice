package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Bank obj = new Bank();

        obj.username = "Priyanshu";          // public → allowed
        obj.accountType = "Savings";         // protected → allowed (same package)
        obj.setBalance(50000);               // private → via method

        obj.show();
    }
}

class Bank {

    public String username;          // public
    protected String accountType;    // protected
    private int balance;             // private

    // setter for private variable
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // getter for private variable
    public int getBalance() {
        return balance;
    }

    void show() {
        System.out.println(username);
        System.out.println(accountType);
        System.out.println(balance);
    }
}
