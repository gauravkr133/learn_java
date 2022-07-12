import java.io.FileReader;

public class Filereader {
      public static void main(String[] args) throws Exception{
              FileReader fr = new FileReader("E:\\Gaurav\\java\\java_learn\\14_javaIO\\gaurav.txt");    
              int i;
              while((i=fr.read())!=-1){
                      System.out.print((char)i);
              } 
              fr.close();

      }  
}
