import java.io.FileOutputStream;

public class Fileoutputstream_write_string {
        public static void main(String[] args) {
                try {
                        FileOutputStream fout = new FileOutputStream("E:\\Gaurav\\java\\java_learn\\14_javaIO\\hello.txt");
                        String s = "Hello \n Gaurav Kumar here...";
                        byte b[] = s.getBytes();
                        fout.write(b);
                        fout.close();
                        System.out.println("Successfully Written");

                } catch (Exception e) {
                        System.out.println(e);
                }
                

        }
}
