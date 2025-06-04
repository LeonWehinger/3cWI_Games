package Test2;

public class ProductMain {
    public static void main(String[] args) {
        Shoe s1 = new Shoe(1,"blue","idk","Jshoe",17.3);
        Phone p1 = new Phone(2,200,"Idk","JPhone");

        GUI1 gui1 = new GUI1();


        gui1.addProduct(s1);
        gui1.addProduct(p1);
        gui1.showAllProducts();
        gui1.sumProducts();



    }
}
