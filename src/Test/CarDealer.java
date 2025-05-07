package Test;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private String name;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public CarDealer(String name){
        this.name=name;
    }

    public void printVehicle(){
        for (Vehicle vehicle: vehicleList){
            System.out.println(vehicle.getName());
        }
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);

    }


}
