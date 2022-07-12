public class Eh_finallyblock {
        public static void main(String[] args) {
                try{
                        System.out.println("Inside try block...");
                        int data = 25/0;
                        System.out.println(data);
                }catch(ArithmeticException e){
                        System.out.println("Exception handling...");
                        System.out.println(e);
                }finally{
                        System.out.println("Finally block is executed...");
                }
                System.out.println("Rest of the code...");
        }
}
