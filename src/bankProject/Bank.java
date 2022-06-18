package bankProject;

public class Bank {
    int balance;
    String userName;
    String password;

    Bank(int balance, String userName, String password) {
        this.balance = balance;
        this.password = password;
        this.userName = userName;
    }

    public void printBalance(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println(balance);
        } else {
            throw new InvalidCredentialsException("please enter valid credentials!!");
        }
    }
}
