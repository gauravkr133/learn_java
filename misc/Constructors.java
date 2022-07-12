public class Constructors{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Anuj";
		System.out.println(p1.age + " " + p1.name);
		p1.eat();
		p1.walk(10);
		System.out.println(Person.count);
		System.out.println(p1.count);
		Person p2 = new Person(28,"Hello");
		p2.walk(10);
	}
}

class Person{
	String name;
	int age;
	static int count;
	
	public Person(){
		count++;
		System.out.println("Creating an object..");
	}
	
	public Person(int newAge,String newName){
		this();
		this.name = newName;
		this.age  = newAge;
		
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

