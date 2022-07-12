import java.util.*;
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        Integer a = new Integer(10);
        Integer b  = new Integer(10);
        m.put(a,"First");
        m.put(b,"Second");
        System.out.println(m);
    }
}
