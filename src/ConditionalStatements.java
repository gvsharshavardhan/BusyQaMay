public class ConditionalStatements {
    public static void main(String[] args) {
        int marks =80;

        // if age is  greater than 18 -> eligible to vote, else not eligible to vote

        if(marks>80)
        {
            System.out.println("GOOD!");
        }else if(marks>50 && marks<80){
            System.out.println("AVERAGE!");
        }else{
            System.out.println("FAIL!");
        }

        System.out.println("bye!");

    }
}
