package example;

public class Person {
    private String name;

    private int age;

    private String socialID;

    public void setName(String name){
        this.name = name;
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

    public void setSocialID(String socialID){
        this.socialID = socialID;
    }

    public void setSocialID(String socialID, boolean isSpecial){
        if(isSpecial){
            this.socialID = socialID.toUpperCase();
        }else {
            this.socialID = socialID;
        }
    }
}
