import java.util.*;
public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        //LinkedList lList = new LinkedList(Collection c);
        l.add("John");
        l.add(15);
        l.add(null);
        System.out.println(l);
        l.set(1,13);
        System.out.println(l);
        l.add(2,true);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst(1);
        System.out.println(l);
    }
}