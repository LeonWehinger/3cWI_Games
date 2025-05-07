package Test;

public class AeroCar extends Car{


    public AeroCar(int id, String name) {
        super(id, name);
    }

    public void fly(String name){
        System.out.println(name + " is flying!");
    }
}
