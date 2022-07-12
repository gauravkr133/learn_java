abstract class Bike{
        Bike(){
                System.out.println("Bike Constructor called...");
        }

        abstract void run();

        void changeGear(){
                System.out.println("Changing gear");
        }
}

class Honda extends Bike{
        void run(){
                System.out.println("Running....");
        }
}


public class Abstract_class_constructor {
        public static void main(String[] args){
                Bike h = new Honda();
                h.run();
                h.changeGear();
        }
}
