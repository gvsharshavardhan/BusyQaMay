public class SwitchDemo {
    public static void main(String[] args) {

        String day = "friday";

        switch (day) {
            case "mon":
                System.out.println("go to office!!");
                break;
            case "tue":
                System.out.println("go to friends home!!");
                break;
            default:
                System.out.println("lets go on vaccation!");
                break;
            case "wed":
                System.out.println("read book!");
                break;
            case "thu":
                System.out.println("learn coding!");
                break;
            case "friday":
                System.out.println("lets go to pub!");
        }
    }
}