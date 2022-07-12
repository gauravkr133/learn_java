public class Constructors {

        static int count = 0;

        Constructors(){
                System.out.println("Object created!");
                count++;
        }

        
        
        public static void main(String[] args){
                new Constructors();//anonymous object
                Constructors c2 = new Constructors();
                System.out.println("No. of objects created: "+count);
        }
}
