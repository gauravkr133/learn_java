interface Drawable{
        void draw();
        default void msg(){
                System.out.println("Default method in JAVA 8.");
        }
}

class Rectangle implements Drawable{
        public void draw(){
                System.out.println("Drawing Rectangle...");
        }
}

public class Interface_default_method {
        public static void main(String[] args) {
                Drawable d = new Rectangle();
                d.draw();
                d.msg();
                
        }
}
