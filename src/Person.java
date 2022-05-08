import java.util.Calendar;
import java.util.Locale;

public class Person {
    private String name;

    private int age;

    private Pet pet;

    public void setName(String name){
        name = name.toLowerCase();
        this.name = name;
        System.out.println(name);
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public int getBirthYear(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - this.age;
    }
}