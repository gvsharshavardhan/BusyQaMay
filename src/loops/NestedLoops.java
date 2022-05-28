package loops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int rows;
        int col;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row count: ");
        rows = sc.nextInt();
        System.out.println("Please enter col count: ");
        col = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            if(i%2!=0){
                for(int j=1; j<=col; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <= col; j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i % 2 == 0) {
                    System.out.print("#"); // will print * for odd no lines
                } else
                    System.out.print("*"); // will print # for even no lines
            }
            System.out.println();
        }


    }
}
