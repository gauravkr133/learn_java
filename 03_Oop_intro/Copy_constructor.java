public class Copy_constructor {

        int uid;
        String name;
        int age;
        //Constructor returns the instance of the  current class;
        Copy_constructor(){
                System.out.println("Object instantiated");
        }

        Copy_constructor(int uid,String name,int age){
                this.uid  = uid;
                this.name = name;
                this.age  = age;
        }

        Copy_constructor(Copy_constructor cc){
                this.uid  = cc.uid;
                this.name = cc.name;
                this.age  = cc.age;
        }

        void getData(){
                System.out.println("Uid: "+this.uid);
                System.out.println("Name: "+this.name);
                if(age>0)
                        System.out.println("Age: "+this.age);
        }

        public static void main(String[] args){
                Copy_constructor c1 = new Copy_constructor(1001,"Gaurav",18);
                Copy_constructor c2 = new Copy_constructor(c1);
                c2.getData();

                Copy_constructor c3 = new Copy_constructor();
                c3.uid = c2.uid;
                c3.name = c2.name;
                c3.age  = c2.age;
                c3.getData();
                
        }
        
}
