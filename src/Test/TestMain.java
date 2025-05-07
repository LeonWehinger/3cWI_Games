package Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Car c1 = new Car(1,"Car1");
        Train t1 = new Train(2,"Train1");
        AeroCar ac1 = new AeroCar(3,"AeroCar1");
        CarDealer cd1 = new CarDealer("Luca");

        System.out.println(c1.getName());
        System.out.println(t1.getId());
        System.out.println(ac1.getName());
        c1.drive();
        t1.drive();
        ac1.drive();
        cd1.addVehicle(c1);
        cd1.addVehicle(t1);
        cd1.addVehicle(ac1);
        cd1.printVehicle();

    }



}
