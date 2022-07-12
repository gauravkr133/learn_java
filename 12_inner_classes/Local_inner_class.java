public class Local_inner_class {
        private int data = 30;
        void display(){
               class Local{
                       void msg(){System.out.println("Data is: "+data);}
                       void txt(){System.out.println("Sending text from local class...");}
                }

               Local l = new Local();
               l.msg();
               l.txt();
        } 
        public static void main(String[] args) {
                Local_inner_class l1 = new Local_inner_class();
                l1.display();
        }
}
