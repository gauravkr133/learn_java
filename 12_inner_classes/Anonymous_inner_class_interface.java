
interface Person{
        void eat();
}

public class Anonymous_inner_class_interface {
        public static void main(String[] args) {
                Person p = new Person(){
                        public void eat(){System.out.println("Person is eating...");}
                };
                p.eat();
        }
}
