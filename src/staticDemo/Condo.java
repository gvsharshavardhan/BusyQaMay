package staticDemo;

public class Condo {

    public static String stove;

    public String bedlight;

    static {
        stove = "ON";
    }

    public void run(){
        System.out.println("running");
    }

    public static void walk(){
        System.out.println("walking!");
    }
}
