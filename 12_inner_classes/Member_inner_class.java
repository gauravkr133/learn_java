
public class Member_inner_class{
        private int data = 30;
        class Inner{
                Inner(){System.out.println("Inner Class Instantiated...");}
                void message(){System.out.println("Data is: "+data);}
        }
        public static void main(String[] args) {
                Member_inner_class obj = new Member_inner_class();
                Member_inner_class.Inner in = obj.new Inner(); 
                in.message();
        }
}