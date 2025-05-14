package Test2;

import java.util.ArrayList;
import java.util.List;

public class GUI1 implements GUI{
    private List<Product> productList = new ArrayList<>();


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
}
