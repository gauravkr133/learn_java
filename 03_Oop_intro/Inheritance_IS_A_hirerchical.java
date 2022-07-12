class Animal{
        void eat(){
                System.out.println("Eating...");
        }
}

class Dog extends Animal{
        void bark(){
                System.out.println("Barking...");
        }
}

class Cat extends Animal{
        void meow(){
                System.out.println("Meow...");
        }
}


public class Inheritance_IS_A_hirerchical {
        public static void main(String[] args){
                Cat c = new Cat();
                c.eat();
        }
}
