package recap;

public class TestRecap {
    public static void main(String[] args) {
        Father f = new Father();
        f.setName("Jessica");
        f.setProperty("10 Million");

        System.out.println(f.getName());
        System.out.println(f.getProperty());

        System.out.println(f);

        Son s = new Son();
        s.setJob("Automation engineer!");
        s.setName("Roman");
        s.setProperty("20Million");
        System.out.println(s);

        Father f2 = new Daughter();
        ((Daughter)f2).cooking();

        //d -> ((Daughter)f)
    }
}
