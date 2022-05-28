package arrays;

public class TwoDimArrayDem {
    public static void main(String[] args) {
        int marks[][] = new int[3][3];
        marks[0][0] = 100;
        marks[0][1] = 200;
        marks[0][2] = 300;
        marks[1][0] = 400;
        marks[1][1] = 500;
        marks[1][2] = 600;
        marks[2][0] = 700;
        marks[2][1] = 800;
        marks[2][2] = 900;

        for( int[] xyz : marks){
            for(int a : xyz){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
