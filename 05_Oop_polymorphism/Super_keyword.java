class Person{
        int id;
        String name;
        Person(int id,String name){
                this.id   = id;
                this.name = name;
        }

        void getData(){
                System.out.println("..... Super Class .....");
                System.out.println(id+" "+name);
        }

}

class Employee extends Person{
        float salary;
        Employee(int id,String name,float salary){
                super(id,name);
                this.salary = salary;
        }

        void getData(){
                super.getData();
                System.out.println("..... Sub Class .....");
                System.out.println("Employee Id: "+this.id);
                System.out.println("Employee Name: "+this.name);
                System.out.println("Employee Salary: "+this.salary);
        }
}




public class Super_keyword {
        public static void main(String [] args){
                Employee e = new Employee(101,"XUz",1000.5f);
                e.getData();
        }       
}
