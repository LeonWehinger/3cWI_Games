package Test2;

public class ProductMain {
    public static void main(String[] args) {
        Shoe s1 = new Shoe(1,"blue","idk","Jshoe",17.3);

        GUI1 gui1 = new GUI1();


        gui1.addProduct(s1);
        gui1.showAllProducts();


    }
}
