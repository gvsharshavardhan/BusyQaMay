package oops.Polymorph;

public class TestSony {
    public static void main(String[] args) {
        String clientReq = "sonymax";

        if (clientReq.equals("sony")) {
            Sony s = new Sony();
            s.program();
            s.volume();
        } else if (clientReq.equals("sonypro")) {
            SonyPro sp = new SonyPro();
            sp.program();
            sp.volume();
        } else {
            Sonymax sm = new Sonymax();
            sm.program();
            sm.volume();
        }
    }
}
