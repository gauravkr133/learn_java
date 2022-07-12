public class ArrayIntroduction {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;
        
        int[] x = new int[1000];
        System.out.println(x.getClass().getName());
        int[] y = new int[0];
        int[] z = new int['a'];
    }
}
