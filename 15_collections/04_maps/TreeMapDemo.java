import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap(new MySorting());
        //TreeMap m2 = new TreeMap(Comparator c);
        //TreeMap m3 = new TreeMap(SortedMap sm);
        // Map m4 = new HashMap();
        // TreeMap m5 = new TreeMap(m4); 
        m.put(23,"");
        m.put(10,"");
        m.put(10,"Basics");
        m.put(11,"Strong");
        System.out.println(m);
    }
}
