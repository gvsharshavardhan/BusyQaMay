package oops.school;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getTotalMarks());
        s1.printStuInfo();
        Student s2 = new Student("roman", 23, 99, 89);
        Student s3 = new Student("harsha");



    }
}
