import java.io.FileInputStream;

public class Fileinputstream_read_string {
        public static void main(String[] args) {

                try {
                      FileInputStream fin = new FileInputStream("E:\\Gaurav\\java\\java_learn\\14_javaIO\\hello.txt");
                      int i = 0;
                      while((i=fin.read())!=-1){
                              System.out.print((char)i);  
                      }   
                      fin.close();
                } catch (Exception e) {
                        System.out.println(e);
                }
        }
}
