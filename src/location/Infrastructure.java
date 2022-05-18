package location;

public class Infrastructure {
    private String address;

    private int capacity;

    private FoundProperty foundProperty;

    public Infrastructure(String address, int capacity, FoundProperty foundProperty){
        this.address = address;
        this.capacity = capacity;
        this.foundProperty = foundProperty;
    }

    public String getAddress(){
        return this.address;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getFoundProperty(){
        if(this.foundProperty == FoundProperty.GOV_FOUND){
            return "公立";
        }else {
            return "私立";
        }
    }
}
