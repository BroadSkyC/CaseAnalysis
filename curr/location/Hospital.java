package location;

import example.Director;

public class Hospital {
    private Infrastructure info;

    private Director director;

    public static String HospitalName;

    public Hospital(Infrastructure info, Director director){
        this.info = info;
        this.director = director;
    }

    public String getAddress(){
        return this.info.getAddress();
    }

    public int getCapacity(){
        return this.getCapacity();
    }
}
