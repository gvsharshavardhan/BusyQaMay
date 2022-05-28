public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = --b;
        int d = b++;
        int e = c--;
        int f = ++d;
        int g = e+f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //a=11 b=10 c=8 d=10 e=9 f=10 g=19 Amrit
        //a=11 b=10 c=8 d=11 e=6 f=12 g=18 Roman


       // a++ -> a = a+1
        // a-- -> a = a-1
    }
}
