interface A{
        public void a();
        void b();
        void c();
        void d();
}

abstract class B implements A{
        public void c(){
                System.out.println("I am abstract C");
        }
}

class C implements A{
        public void a(){
                System.out.println("I am A");
        }

        public void b(){
                System.out.println("I am B");
        }

        public void c(){
                System.out.println("I am C");
        }

        public void d(){
                System.out.println("I am D");
        }
}



public class Abstract_interface_class {
        public static void main(String[] args){
                A a = new C();
                a.a();
                a.b();
                a.c();
                a.d();
        } 
}
