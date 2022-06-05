package methods;

public class MethodsDemo {

    static void test() {
        System.out.println("hello!");
    }

    static void additionOfNumbers(int a, int b) {
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    static double calculateSimpleInterest(int principleAmt, double interest, int time){
        double finalAmt = principleAmt*(1+interest*time);
        return finalAmt;
    }

    static String giveMeRandomString(){
        return "random123";
    }

    public static void main(String[] args) {
        test();
        additionOfNumbers(4,7);
        double famt = calculateSimpleInterest(1000,0.5,2);
        System.out.println(famt);
        String value  = giveMeRandomString();
        System.out.println(value);
    }
}