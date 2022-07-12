
public class Inheritance{
	public static void main(String[] args){
		Developer d1 = new Developer(15,"yd");
		
		d1.walk(15);
		d1.walk();
	}
}

class Person{
	String name;
	int age;
	
	public Person(int age,String name){
		this.name = name;
		this.age  = age;
	} 
	
	void walk(){
		System.out.println(name+" is walking.");
	}
	
	void eat(){
		System.out.println(name+" is eating.");
	}
	
	void walk(int steps){
		System.out.println(name+" walked "+steps+" steps.");
	}
	
}

class Developer extends Person{
	public Developer(int age,String name){
		super(age,name);
	}
	
	void walk(){
		System.out.println("Developer "+name+" is walking.");
	}
}

//Super keyword is used to call constructor of parent class