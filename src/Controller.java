package prev;

import location.FoundProperty;
import location.Infrastructure;

public class Controller {
    public static void main(String[] args){
        Infrastructure infrastructure = new Infrastructure("南京市汉口路22号", 30000, FoundProperty.GOV_FOUND);
        System.out.println("南京大学是" + infrastructure.getFoundProperty() + "的。");
    }
}
