package oops.Polymorph;

public class TestPro {
    public static void main(String[] args) {
        String client = "sonypro";
        Sony s;

        if(client.equals("chrome")){
            s = new Sony();
        }else if(client.equals("sonypro")){
            s = new SonyPro();
        }else {
            s = new Sonymax();
        }

        s.volume();
        s.program();
    }
}
