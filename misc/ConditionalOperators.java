import java.util.Scanner;

public class ConditionalOperators{
	public static void main(String[] args){
		//conditional statements
		boolean isSunUp = true;
		if(isSunUp == true){
			System.out.println("Day");
		}else{
			System.out.println("Night");
		}
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int age = sc.nextInt();
		if(age>18)
			System.out.println("Can vote");
		else
			System.out.println("Can't vote");
	}
}