package Lab4;

/**
 * Created by Tanner on 3/19/2017.
 */
public class Faculty extends Employee {
    private String courses [];

    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for (int i=0;i<courses.length;i++)
            temp[i] = new String(courses[i]);
        return temp;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Faculty (String name, double salary, String[] courses){
        super.name = name;
        super.salary = salary;

        this.courses = courses;

    }
    @Override public String getName(){
        return "Professor " + name;
    }
    @Override public String toString (){
        String info = "Name: "+ getName()+
                "\nSalary: " + getSalary()+
                "\nCourses: "+getCourses();
        return info;
    }
}

