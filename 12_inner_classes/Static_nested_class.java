public class Static_nested_class {
        static int data = 40;
        static class S_class{
                void msg(){System.out.println("hello normal method...");}
                static void txt(){System.out.println("Static void text...");}
        }
        public static void main(String[] args) {
                //Static_nested_class.S_class obj = new Static_nested_class.S_class();
                //obj.msg();
                Static_nested_class.S_class.txt();
        }
}
