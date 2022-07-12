public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] x = new int[3][];
        x[0] = new int[3];
        x[1] = new int[1];
        x[2] = new int[2];
        x[0][0] = 15;
        x[0][1] = 10;
        x[0][2] = 60;
        System.out.println(x[0][2]);
    }
}
