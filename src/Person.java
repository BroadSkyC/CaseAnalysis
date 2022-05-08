import java.util.Calendar;

public class Person {
    private String name;

    private int age;

    private ITCompany workPlace;

    public void setName(String name){
        this.name = name;
    }

    public int getBirthYear(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - this.age;
    }

    public String get(String prefix){
        return prefix + this.name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayHello(String target){
        System.out.println("Hello!" + target + ".");
    }
}
