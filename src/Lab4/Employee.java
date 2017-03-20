package Lab4;

/**
 * Created by Tanner on 3/19/2017.
 */
public class Employee implements Rules {
    public String name = "";
    public double salary = 0;

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public Employee (){

    }
    public String toString (){
        String info = "name:"+ getName()+
                "\nsalary:" + getSalary();
        return info;

    }
}
