import java.util.Scanner;

public class Conditional_statement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//pen = 10; notebook = 40;
		System.out.println("Enter the amount you have");
		int cash = sc.nextInt();
		
		if(cash < 10){
			System.out.println("Cannot buy anything");
			System.out.println("get more cash");
		}else if(cash > 10 && cash < 50){
			System.out.println("Can get 1 thing");
		}else{
			System.out.println("can get both");
		}
		
		//Switch Case
		int day = sc.nextInt();
		switch(day){
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid");
			
		}
		
	}
}