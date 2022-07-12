class Adder{
        static int add(int a,int b){return a+b;}
        static int add(int a,int b,int c){return a+b+c;}
}

public class Method_overloading_arguments{
        public static void main(String[] args){
                System.out.println("Sum of two numbers: "+Adder.add(15,16));
                System.out.println("Sum of three numbers: "+Adder.add(15,16,17));
        }
        
}