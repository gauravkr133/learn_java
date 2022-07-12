public class Array_anonymous {
        static void printArr(int arr[]){
                for(int i:arr){
                        System.out.print(i+" ");
                }
        }
       public static void main(String[] args){
               printArr(new int[] {55,8,4,6,22});
       } 
}
