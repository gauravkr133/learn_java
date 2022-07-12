public class Eh_nested_try_catch{
        public static void main(String[] args) {
                try{
                        try{
                                System.out.println("Dividing by zero...");
                                int b = 39/0;
                        }catch(ArithmeticException e){
                                System.out.println(e);
                        }

                        try{
                                int a[] = new int[5];
                                a[6] = 5;
                        }catch(ArrayIndexOutOfBoundsException e){
                                System.out.println(e);
                        }

                        System.out.println("Rest of the code....");

                }catch(Exception e){
                        System.out.println(e);
                }
                System.out.println("Rest of the code outside...");
        }       
}
