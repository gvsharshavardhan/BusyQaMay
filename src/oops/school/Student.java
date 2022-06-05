package oops.school;

public class Student {
    private String name;
    public int rollno;
    int math_marks;
    int cs_marks;

    public Student(){

    }

    Student(String name, int rollno, int math_marks, int cs_marks){
        this.name = name;
        this.rollno = rollno;
        this.math_marks = math_marks;
        this.cs_marks = cs_marks;
    }

    Student(String sname){
        this(sname, 201,34,54);
    }


    public int getTotalMarks(){
        return math_marks + cs_marks;
    }

    public void printStuInfo(){
        System.out.println("Name: "+ name+ " rollno: "+ rollno);
    }
}