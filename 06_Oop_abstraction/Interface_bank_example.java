interface Bank{
        void getInterest();
}

class Sbi implements Bank{
        public void getInterest(){
                System.out.println("9.4");
        }
}

class Axis implements Bank{
        public void getInterest(){
                System.out.println("13.0");
        }
}

public class Interface_bank_example {
        public static void main(String[] args){
                Bank b = new Sbi();
                b.getInterest();
        }
}
