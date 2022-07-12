interface Printable{}

class A implements Printable{
        public void a(){
                System.out.println("A");
        }
}

class B implements Printable{
        public void b(){
                System.out.println("B");
        }
}

class Call{
        void invoke(Printable p){
                if(p instanceof A){
                        A a = (A)p;
                        a.a();
                }

                if(p instanceof B){
                        B b = (B)p;
                        b.b();
                }
        }
}

public class Instance_of_operator {
        public static void main(String[] args) {
                Printable p = new B();
                Call c1 = new Call();
                c1.invoke(p); 
        }
}
