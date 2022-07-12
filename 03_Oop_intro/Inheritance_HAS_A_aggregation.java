class Employee{
        int e_id;
        String e_name;
        Address address;

        Employee(int e_id,String e_name,Address address){
                this.e_id    = e_id;
                this.e_name  = e_name;
                this.address = address; 
        }

        void getData(){
                System.out.println("Employee Id: "+this.e_id);
                System.out.println("Employee Name: "+this.e_name);
                System.out.println("Employee Address: "+address.area_name+","+address.pincode);
        }
}

class Address{
        int pincode;
        String area_name;
        Address(int pincode,String area_name){
                this.pincode   = pincode;
                this.area_name = area_name;
        }
}



public class Inheritance_HAS_A_aggregation{
        public static void main(String[] args){
                Address  a1 = new Address(822101,"Daltonganj");
                Employee e1 = new Employee(101,"Vipul Pandey",a1);
                e1.getData();
        }
        
}
