public class Swapping {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        System.out.println("before swapping!");
        System.out.println(a);
        System.out.println(b);

        c = b;
        b = a;
        a = c;

        System.out.println("After swaaping!");
        System.out.println(a);
        System.out.println(b);
    }
}
