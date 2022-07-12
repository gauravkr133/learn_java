interface Drawable{
        void draw();
        static int cube(int x){return x*x*x;}
}

class Rectangle implements Drawable{
        public void draw(){
                System.out.println("Drawing Rectangle...");
        }
}

public class Interface_static_method{
        public static void main(String[] args){
                Drawable d = new Rectangle();
                d.draw();
                System.out.println("Cube of 2 is: "+Drawable.cube(2));
                
        }
}