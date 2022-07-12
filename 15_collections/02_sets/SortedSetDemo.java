import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();
        s.add(5);
        s.add(10);
        s.add(11);
        s.add(15);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet(15));
        System.out.println(s.tailSet(10));
        System.out.println(s.subSet(5,11));
    }
}
