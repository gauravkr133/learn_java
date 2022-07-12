
class Animal{
        void isEating(){
                System.out.println("Dynamic Binding\n Animal Is eating.");
        }
}

class Cat extends Animal{
        void isEating(){
                System.out.println("Dynamic Binding\n Cat is eating.");
        }
}

public class Static_Dynamic_Binding {
        private void satic_func(){
                System.out.println("Static Binding....\n ");
        }

        public static void main(String[] args) {
                Static_Dynamic_Binding s1 = new Static_Dynamic_Binding();
                s1.satic_func();              
                Animal a1 = new Cat();
                a1.isEating();
        }
}
