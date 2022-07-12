class Array_pass_to_method{
        static void arr_min(int arr[]){
                int min = arr[0];
                for(int i:arr){
                        if(min>i){
                                min = i;
                        }
                }
                System.out.println(min);
        }

        public static void main(String[] args){
                int b[] = {5,8,9,6,2};
                arr_min(b);     
        }
}