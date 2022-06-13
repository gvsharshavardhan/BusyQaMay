package collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap();
        m.put("marks", 12);
        m.put("age", 22);
        m.put("phno", 12234);
        m.put("height", 6);

        System.out.println(m);

        Set entries = m.entrySet();
        System.out.println(entries);

        for (Object e : entries) {
            Map.Entry entry = (Map.Entry) e;
            String key = "";
            if (entry.getKey() instanceof String) {
                key = (String) entry.getKey();
            }
            int value = (Integer) entry.getValue();
            System.out.println("KEY: " + key + "\tVALUE: " + value);

        }


    }
}
