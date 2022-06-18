package exceptionsDemo;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] abc = new int[2];

        try {
            System.out.println(a / b);//risky
            abc[3] = 98;
        } finally {
            System.out.println("im inside finally block!!");
        }
//        try {
//            abc[3] = 98;
//        } catch (ArrayIndexOutOfBoundsException aeib) {
//            System.out.println(aeib);
//        }
        System.out.println("I am safe!!");
    }
}
