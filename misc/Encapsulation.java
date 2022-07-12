public class Encapsulation{
	public static void main(String[] args){
		Laptop l1 = new Laptop();
		l1.ram = 4;
		l1.setPrice(15000);
		l1.getPrice();
	}
}

class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void getPrice(){
		System.out.println(price);
	}
}