import java.util.*;
public class HashMapDemo{
    public static void main(String[] args) {
        HashMap <String,Integer> marks  = new HashMap<>();
        marks.put("Science",90);
        marks.put("Maths",80);
        marks.put("English",90);
        System.out.println(marks.get("English"));
        System.out.println(marks.size());
        System.out.println(marks.keySet());
        System.out.println(marks);
        // Map map1 = new HashMap();
        // HashMap map2  = new HashMap(20);
        // HashMap map3  = new HashMap(20,0.9f);
        // HashMap map4  = new HashMap(map1);

    }
}