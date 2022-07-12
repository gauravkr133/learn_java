import java.util.Arrays;

public class Variables{
	public static void main(String[] args){
		/*Types of variable
			byte - 1 [-128 to 127]
			short - 2 bytes
			int - 4 bytes
			long - 8 bytes
			float - 4 bytes
			double - 8 bytes
			char - 2 bytes
			boolean - 1  bytes
		*/
		//primitive data types
		byte age = 30;
		int phone = 1234567890;
		long phone2 = 12345678900L;
		float pi = 3.14F;
		char letter = '@';
		boolean isAdult = false;
		//Non-primitive data types
		
		/*Strings
		
		//concatenation
		String fname = "Aman";
		String lname = "Kumar";
		String fullname = fname+lname;
		//charAt
		System.out.println(fname.charAt(0));
		//length
		System.out.println(fname.length());
		//replace
		String replace_name = fname.replace('a','A');
		System.out.println(replace_name);
		//substring
		String substring_name = "Gaurav Kumar";
		System.out.println(substring_name.substring(2,8));
		*/
		
		/* Arrays
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 91;
		marks[2] = 100;
		System.out.println(marks[2]);
		//length of array
		System.out.println(marks.length);
		// sort array
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		int[][] finalMarks = {{97,98,95},{95,95,98}};
		System.out.println(finalMarks[0][1]);
		*/
		//constant
		final float PI = 3.14F;//cannot be changed
		
		
		
		
		
		
	}
}