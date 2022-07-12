import java.util.Scanner;

public class Input{
	public static void main(String[] args){
		//How to take INPUT?
		Scanner sc = new Scanner(System.in);
		//System.out.println("Input Your Age: ");
		//int age = sc.nextInt();
		//System.out.println(age);
		//System.out.println("Input your name: ");
		//String name = sc.next();//takes single word as input
		//System.out.println(name);
		System.out.println("Input your full name: ");
		String fullname = sc.nextLine();
		System.out.println(fullname);	
	}
}