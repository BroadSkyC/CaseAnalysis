package curr;

import location.Hospital;
import location.Infrastructure;
import location.InfrastructureType;

public class Controller {
    public static void main(String[] args){
        Infrastructure infrastructure = new Infrastructure("南京市汉口路22号", 30000, InfrastructureType.SCHOOL);
    }

    public void showHospitalName(){
        System.out.println(Hospital.HospitalName);
    }
}
