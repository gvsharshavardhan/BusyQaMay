package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(true);
        al.add(23.45);
        al.add(new Student(1,2,3));
        al.add(null);
        al.add(null);
        al.add(10);




//        ArrayList al2 = new ArrayList();
//        al2.add(23);
//        al2.add(false);
//        al2.add(55.66);
//        al2.add(null);
//
//        al.add(al2);
//        System.out.println(al);


        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("abcd");
        hs.add(false);
        hs.add(new Student(4,5,6));
        hs.add("abcd");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

    }
}
