package example;

public class Doctor extends Person{
    private String profession;

    private int workYears;

    public Doctor(String profession, int workYears){
        this.profession = profession;
        this.workYears = workYears;
    }
}
