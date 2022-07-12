public class Eh_try_catch{
        public static void main(String[] args) {
                try{
                        int data = 50/0;
                }catch(ArithmeticException e){
                        System.out.println(e);
                }
                System.out.println("Successfully handled...");
        }
}