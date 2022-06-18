package collectionsdemo;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//* -> All

public class Map2Demo {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap();
        m.put("onion", 2);
        m.put("tomato", 3);
        m.put("eggplant", 5);
        m.put("potato", 6);

        Set<Map.Entry<String, Integer>> s = m.entrySet();
        for (Map.Entry<String, Integer> e : s) {
            String str = e.getKey();
            Integer i = e.getValue();
            System.out.println("key: " + str + "\tValue: " + i);
            if (e.getKey().equals("potato")) {
                e.setValue(50);
            }
            i = e.getValue();
            System.out.println("key: " + str + "\tValue: " + i);
        }
    }
}
