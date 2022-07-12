
public class Variables{
    static int m = 90;//Static variable

    void method(){
        int a = 30;//Local Variable
        System.out.println(a);

    }

    public static void main(String[] args){
        int data = 50;//Instance Variable
        //Variables v = new Variables();
        //v.method();

        Variables_add v = new Variables_add();
        v.add();
        
    }
}