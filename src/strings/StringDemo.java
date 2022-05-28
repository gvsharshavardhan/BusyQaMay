package strings;

public class StringDemo {
    public static void main(String[] args) {
        String color = "white";
        String color2 = "white";
        String color3 = new String("white");
        String color4 = new String("white");
        String color5 = color2;
        String color6 = color4;
        System.out.println(color==color6);//true, false, false, f
        System.out.println(color3==color4);//false, false, true, f
        System.out.println(color5==color6);//true, false, false, f

        System.out.println("*******************************************");
        //amrit example
        String a = new String("red");
        String b = a;
        String c = "red";

        System.out.println(a==b);//true
        System.out.println(c==b);//false
        System.out.println(a==c);//false


    }
}
