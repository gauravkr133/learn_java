class Adder{
        static void add(int a,int b){
                System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
        }
        static void add(int a,long c){
                System.out.println("Sum of "+a+" and "+c+" is: "+(a+c));
        }
}

public class Method_overloading_datatype {
        public static void main(String[] args){
                Adder.add(5, 6);
                Adder.add(5, 5);
        }
}
