class Child{
        final String name = "XYZ";

        void changeName(){
                //name = "ABC";//Compile time error will be generated 
                System.out.println("Final variable cannot be changed else will generate compile time error.");
        }

        final void final_method(){
                System.out.println("I'am Inherited but never Overriden.");
        }
}

class Student extends Child{

        final int PanCard;
        static final int marks;
        static{ marks = 50;}
        //Static block can initialize static final variable;
        Student(){
                PanCard = 254;
                System.out.println("Constructor can initialized already defined final variable.");
        }
        /*void final_method(){
                System.out.println("I'am Inherited but never Overriden.");
        }  Final method cannot be overriden else it will generate compile time error*/
}

class Bike{

}


class Honda extends Bike{
        void printMessage(){
                System.out.println("Final class cannot be inherited.");
        }
}

public class Poly_final_keyword {
        public static void main(String[] args){
                Student s1 = new Student();
                s1.changeName();
                s1.final_method();

                Honda h1 = new Honda();
                h1.printMessage();
        }
}
