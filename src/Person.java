import java.util.Calendar;

public class Person {
    private String name;

    private ITCompany workPlace;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayHello(String hello){
        System.out.println(hello);
    }

    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - 2000;
    }
}
