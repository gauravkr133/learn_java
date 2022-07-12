public class If_else{

    public static void main(String[] args){
        String address = "xyz, India";

        if(address.endsWith("India")){
            if(address.contains("xyz")){
                System.out.println("Your city is xyz");
            }
        }else if(address.contains("abc")){
            System.out.println("Your city is abc");
        }else{
            System.out.println("You are not in India");
        }

    }
} 