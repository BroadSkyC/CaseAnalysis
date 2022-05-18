package location;

public class Infrastructure {
    private String address;

    private int capacity;

    private InfrastructureType type;

    public Infrastructure(String address, int capacity, InfrastructureType type){
        this.address = address;
        this.capacity = capacity;
    }

    public String getAddress(){
        return this.address;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
