public class Interfaces implements Car{
	public static void main(String[] args){
		@Override
		public void start(){
			System.out.println("Car is starting...");
		}
	}
}



interface Car{
	void start();
}