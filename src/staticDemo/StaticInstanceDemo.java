package staticDemo;

public class StaticInstanceDemo {
    public String name;

    public static String clgName;

    public StaticInstanceDemo(String name){
        System.out.println("I am inside a const");
        this.name = name;
    }

    static {
        System.out.println("I am inside a static block");
        clgName = "ABC College";
    }

    public static void staticMethod(){
        System.out.println("I am inside static method");
    }

    public void instMethod(){
        System.out.println("I am inside instance method");
    }
}
