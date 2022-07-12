import java.util.NavigableMap;
import java.util.*;
public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<String,Integer> t = new TreeMap<>();
        t.put("ABC",123);
        t.put("DEF",456);
        t.put("HIJ",789);
        t.put("MNO",546);
        t.put("PQR",776);
        t.put("XYZ",775);
        t.put("JKL",987);
        t.put("STU",544);
        t.put("LMN",543);
        System.out.println(t);
        System.out.println(t.ceilingEntry("HIJ"));
        System.out.println(t.floorKey("PQR"));
        System.out.println(t.higherKey("ABC"));
        System.out.println(t.lowerKey("PQR"));
        System.out.println(t.ceilingKey("XYZ"));
    }
}
