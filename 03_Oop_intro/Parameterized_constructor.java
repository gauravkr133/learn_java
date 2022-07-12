public class Parameterized_constructor{
        int uid;
        String name;
        int age;

        Parameterized_constructor(){
                System.out.println("Object Created!!");
        }

        Parameterized_constructor(int uid,String name){
                this.uid = uid;
                this.name = name;
        }

        Parameterized_constructor(int uid,String name,int age){
                this.uid  = uid;
                this.name = name;
                this.age  = age;
        }

        void getData(){
                System.out.println("Uid: "+this.uid);
                System.out.println("Name: "+this.name);
                if(age>0)
                        System.out.println("Age: "+this.age);
        }

        public static void main(String[] args){
                Parameterized_constructor p1 = new Parameterized_constructor();
                Parameterized_constructor p2 = new Parameterized_constructor(1001,"Gaurav",0);
                p2.getData();
        }

}