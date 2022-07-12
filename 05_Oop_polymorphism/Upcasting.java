class Bike{
        int speedLimit =40;
        
        void getLimit(){
                System.out.println("Speed Limit of your bike is: "+this.speedLimit);
        } 
}


class Passion extends Bike{
        int speedLimit = 100;
        void getLimit(){
                System.out.println("Speed limit of bike is: "+this.speedLimit);
        }
} 

public class Upcasting{
        public static void main(String[] args){
                Bike b1 = new Passion();
                b1.getLimit();
        }
}