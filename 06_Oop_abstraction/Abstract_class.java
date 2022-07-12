abstract class Shape{
        abstract void drawShape();
} 

class Rectangle extends Shape{
        void drawShape(){
                System.out.println("Drawing Rectangle");
        }
}

class Square extends Shape{
        void drawShape(){
                System.out.println("Drawing Square");
        }
}

class Circle extends Shape{
        void drawShape(){
                System.out.println("Drawing circle");
        }
}


public class Abstract_class{
        public static void main(String[] args){
                Shape r = new Rectangle();
                r.drawShape();

                Shape s = new Square();
                s.drawShape();

                Shape c = new Circle();
                c.drawShape();
        }
}