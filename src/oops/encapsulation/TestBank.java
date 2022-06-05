package oops.encapsulation;

import oops.inheritance.Father;

public class TestBank {
    public static void main(String[] args) {
        Bank abc = new Bank();
        abc.depositAmt(1000,"harsha","pass");
        abc.checkBalance("harsha","pass");


        Father f = new Father();

    }
}
