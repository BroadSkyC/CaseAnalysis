public class Pet extends Animal{
    private String name;

    public String getName(){
        return this.name;
    }

    public String getName(String masterName){
        return masterName + "的" + this.name;
    }
}
