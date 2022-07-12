
public class Exception_Handling{
	public static void main(String[] args){
		//TRY - CATCH in Exception Handing
		int[] marks = {97,98,95};
		try{
			System.out.println(marks[5]);
		}catch(Exception exception){
			//do something
		}
		System.out.println("The student name is Aman");
	}
}