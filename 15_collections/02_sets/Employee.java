import java.lang.*;

public class Employee implements Comparable{
    private String name;
    private int salary;
    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Object o){
        return 0;
    }




}
