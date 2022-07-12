import java.util.*;
public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList aList = new ArrayList(30);
        //ArrayList aListnew = new ArrayList(Collection c);
        al.add("john");
        al.add(true);
        al.add(10);
        System.out.println(al);
        //al.remove(1);
        al.remove(new Integer(10));
        System.out.println(al);
        System.out.println(al.get(1));

        ArrayList<String> strList = new ArrayList<String>();
        
    }
}