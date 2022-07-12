interface Printable{
        void print();
}

interface Showable{
        void show();
}



public class Inheritance_IS_A_multiple implements Printable,Showable{
        @Override
        public void print() {
                System.out.println("Printing...");
        }

        @Override
        public void show(){
                System.out.println("Showing...");
        }

        public static void main(String[] args){
                Inheritance_IS_A_multiple obj = new Inheritance_IS_A_multiple();
                obj.print();
                obj.show();  
        }
}