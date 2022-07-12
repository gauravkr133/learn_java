class Bank{
        void getInterest(){
                System.out.println("0 %");
        }
}

class Axis_bank extends Bank{
        void getInterest(){
                System.out.println("5 %");
        }
}

class ICICI_bank extends Bank{
        void getInterest(){
                System.out.println("10 %");
        }
}

public class Method_overriding{
        public static void main(String[] args){
                Bank b = new Bank();
                b.getInterest();

                Axis_bank a = new Axis_bank();
                a.getInterest();
        }
}