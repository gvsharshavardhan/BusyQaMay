package collectionsdemo;

public class Student {

    int math;
    int phy;
    int che;

    Student(int math,int phy, int che){
        this.math = math;
        this.phy = phy;
        this.che = che;
    }

    double getAverage(){
        return (this.che+this.math+this.phy)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "math=" + math +
                ", phy=" + phy +
                ", che=" + che +
                '}';
    }
}
