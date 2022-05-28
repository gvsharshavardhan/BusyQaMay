import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value A: ");
        int a = sc.nextInt();
        System.out.println("Please enter value B: ");
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
