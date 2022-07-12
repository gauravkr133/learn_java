import java.util.*;
public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> data = new TreeSet<Integer>();
        data.add(1000);
        data.add(3000);
        data.add(100);
        data.add(500);
        data.add(6000);
        data.add(8000);
        System.out.println("---- Tree Set -----");
        System.out.println(data);
        System.out.println(data.floor(13550));
        System.out.println(data.lower(14000));
        System.out.println(data.ceiling(2500));
        System.out.println(data.higher(4000));
        System.out.println(data.pollFirst());
        System.out.println(data.pollLast());
        System.out.println(data.descendingSet());

    }   
}
