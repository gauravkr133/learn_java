import java.util.concurrent.*;
public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer,String>();
        map.put(0,"Basics");
        map.put(1,"Strong");
        map.put(0,"Tech");
        System.out.println(map);
    }
}
