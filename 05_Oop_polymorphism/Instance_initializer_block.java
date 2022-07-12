class A{
        A(){
                System.out.println("Parent Class constructor");
        }
}




public class Instance_initializer_block extends A{
        Instance_initializer_block(){
                System.out.println("Child class constructor");
        }

        Instance_initializer_block(int a){
                System.out.println("Child class constructor "+a);
        }

        {System.out.println("Instance initializer block");}

        public static void main(String[] args){
                Instance_initializer_block i1 = new Instance_initializer_block();
                Instance_initializer_block i2 = new Instance_initializer_block(10);
                System.out.println("Successful execution...");
        }
}
