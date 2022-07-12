import javax.jws.soap.SOAPBinding.Style;

public class StringBasic{
        public static void main(String[] args){
                char str[] = {'h','e','l','l','o'};
                String s = new String(str);
                System.out.println(s);
                
                String a = "Hello_world";
                System.out.println(a);
        }
}