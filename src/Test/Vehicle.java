package Test;

public abstract class Vehicle {

    private int id;
    private String name;


    public Vehicle(int id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract void drive();


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
