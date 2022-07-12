class Employee{
        int e_id;
        String e_name;
        int e_salary;
}

class Programmer extends Employee{
        int e_bonus;

        void setData(int e_id,String e_name,int e_salary,int e_bonus){
                this.e_id     = e_id;
                this.e_name   = e_name;
                this.e_salary = e_salary;
                this.e_bonus  = e_bonus;
        }

        void getData(){
                System.out.println("Employee Id: "+this.e_id);
                System.out.println("Employee Name: "+this.e_name);
                System.out.println("Employee Salary: "+this.e_salary);
                System.out.println("Employee Bonus: "+this.e_bonus);
                System.out.println("Total Salary: "+(this.e_salary+this.e_bonus));
        }
}

public class Inheritance_IS_A_single {
        public static void main(String[] args){

                Programmer p1 = new Programmer();
                p1.setData(101,"Gaurav",10000,500);
                p1.getData();

        }
        
}
