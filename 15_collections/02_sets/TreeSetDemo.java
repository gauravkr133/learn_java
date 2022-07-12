import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();
        //TreeSet ts2 = new TreeSet((Comparator c));
        SortedSet s = new SortedSet();
        TreeSet ts3 = new TreeSet(s);
        //TreeSet ts4 = new TreeSet(Collection c);
        TreeSet<Employee> ts5 = new TreeSet<Employee>();
        ts5.add(new Employee("john",30000));

    }
}
