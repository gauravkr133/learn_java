interface Printable{
        void print();
}

interface Showable extends Printable{
        void show();
}

public class Interface_inheritance implements Showable{
        
        public void print(){
                System.out.println("Printing...");
        }

        public void show(){
                System.out.println("Showing...");
        } 
        public static void main(String[] args) {

                Interface_inheritance i = new Interface_inheritance(); 
                i.print();
                i.show();
                
        }
}
