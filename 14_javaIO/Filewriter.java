import java.io.FileWriter;

public class Filewriter {
        public static void main(String[] args) {
                try {
                      FileWriter fw = new FileWriter("E:\\Gaurav\\java\\java_learn\\14_javaIO\\gaurav.txt");
                      fw.write("Hello welcome....");
                      fw.close();
                      System.out.println("Successfully executed...");
                } catch (Exception e) {
                        System.out.println(e);
                }
        }
}
