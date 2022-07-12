import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Eh_throws {

        public static void method() throws FileNotFoundException{
                FileReader file = new FileReader("E:\\Gaurav\\java\\java_learn\\11_exception_handling\\ab.txt");
                BufferedReader fileInput = new BufferedReader(file);
                throw new FileNotFoundException();
        }
        public static void main(String[] args) {
                try{
                        method();

                }catch(FileNotFoundException e){
                        e.printStackTrace();
                }
                System.out.println("Rest of the code....");
        }
}
