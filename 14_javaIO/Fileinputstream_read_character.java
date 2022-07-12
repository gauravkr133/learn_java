import java.io.FileInputStream;

public class Fileinputstream_read_character{
        public static void main(String[] args) {
                try {
                        FileInputStream fin = new FileInputStream("E:\\Gaurav\\java\\java_learn\\14_javaIO\\hello.txt");
                        int i = fin.read();
                        System.out.println((char)i);
                        fin.close();
                } catch (Exception e) {
                        System.out.println(e);
                }
                
        }
}