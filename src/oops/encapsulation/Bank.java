package oops.encapsulation;

public class Bank {
    private int locker;
    private String username = "harsha";
    private String password = "pass";


    public void depositAmt(int amount, String username, String password) {
        if (this.username.equals(username) && this.password.equals(password))
            this.locker = this.locker + amount;
    }

    public void checkBalance(String username, String password){
        if (this.username.equals(username) && this.password.equals(password))
            System.out.println("Balance: "+ locker);
    }
}
