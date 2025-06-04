package Test2;

import java.util.ArrayList;
import java.util.List;

public class GUI1 implements GUI{
    private List<Product> productList = new ArrayList<Product>();


    @Override
    public void start() {

    }

    public void showAllProducts(){
        for (Product product: productList){
            System.out.println(product.getTitle());
        }
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);

    }

    public void sumProducts(){
        double value = 0;
        for (Product product: productList){
            value += product.getPrice();
        }
        System.out.println(value);
    }
}
