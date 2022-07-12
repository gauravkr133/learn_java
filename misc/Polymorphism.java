public class Polymorphism{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Anuj";
		System.out.println(p1.age + " " + p1.name);
		p1.eat();
		p1.walk(10);
	}
}

class Person{
	String name;
	int age;
	
	void walk(){
		System.out.println(name+" is walking.");
	}
	
	void eat(){
		System.out.println(name+" is eating.");
	}
	
	void walk(int steps){
		System.out.println(name+" walked "+steps+" steps.");
	}
	
	//Polymorphism means different forms and here the function walk has 2 different forms.
}

