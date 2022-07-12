import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListIterDemo {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Raj");
        data.add("Ramesh");
        data.add("Amrish");
        data.add("Jai");
        data.add("Khushal");
        System.out.println(data);
        ListIterator li = data.listIterator();
        while(li.hasNext()){
            String item = (String)li.next();
            System.out.println(item);
        }
    }
}
