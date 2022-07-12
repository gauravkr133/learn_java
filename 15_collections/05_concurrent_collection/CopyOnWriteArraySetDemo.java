import java.util.concurrent.*;
import java.util.*;
public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>();
        //CopyOnWriteArraySet<String> set2 = new CopyOnWriteArraySet<>(Collection c);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Basics");
        list.add("Strong");
        list.add("Basics");
        list.add("Strong");
        CopyOnWriteArraySet<String> set2 = new CopyOnWriteArraySet<>(list);
        System.out.println(set2);
    }
}
