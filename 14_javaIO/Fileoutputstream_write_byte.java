import java.io.FileOutputStream;

public class Fileoutputstream_write_byte{
        public static void main(String[] args) {
                try{
                        FileOutputStream fout = new FileOutputStream("E:\\Gaurav\\java\\java_learn\\14_javaIO\\hello.txt");
                        fout.write(65);
                        fout.close();
                        System.out.println("Successfully written...");
                }catch(Exception e){
                        System.out.println(e);
                }  
        }
        
}