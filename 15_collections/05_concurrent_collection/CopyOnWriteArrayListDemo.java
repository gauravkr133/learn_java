import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo {
    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
    public static void main(String[] args) {
        list.add("John");
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            String name = (String)itr.next();
            if(name.equals("Harry")){
                itr.remove();
            }
        }
        System.out.println(list);
    }

}
