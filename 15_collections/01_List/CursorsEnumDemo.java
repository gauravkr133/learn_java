import java.util.*;
public class CursorsEnumDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:- ");
        for(int i = 0;i<=8;i++){
            int data = sc.nextInt();
            v.addElement(data);
        }
        System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Integer element = (Integer)e.nextElement();
            if(element%3 == 0){
                System.out.println(element);
            }
        }
    }
}
