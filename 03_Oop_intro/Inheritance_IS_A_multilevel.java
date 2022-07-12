class Animal{
        void eat(){
                System.out.println("Eating....");
        }
}

class Dog extends Animal{
        void bark(){
                System.out.println("Barking...");
        }
}

class BabyDog extends Dog{
        void weeping(){
                System.out.println("Weeping...");
        }
}


public class Inheritance_IS_A_multilevel{
        public static void main(String[] args){
                BabyDog d1 = new BabyDog();
                d1.eat();
                d1.bark();
                d1.weeping();
        }
        
}
