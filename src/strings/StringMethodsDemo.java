package strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "harsha vArdhan";
        String name2 = "Harsha";
        String names[] = name.split("a");
        for(String x:names){
            System.out.println(x);
        }

    }
}