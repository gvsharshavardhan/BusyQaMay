package arrays;

public class ArrayDem {
    public static void main(String[] args) {

        int marks[] = new int [4];
        marks[0] = 98;
        marks[1] = 88;
        marks[2] = 78;
        marks[3] = 68;

        for(int mark:marks){
            System.out.println(mark);
        }

        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


    }
}
