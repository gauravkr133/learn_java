import java.util.ArrayList;
import java.util.Iterator;

public class CursorIterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(12);
        data.add(13);
        data.add(18);
        data.add(1);
        data.add(17);
        Iterator itr = data.iterator();
        while(itr.hasNext()){
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }
    }
}
