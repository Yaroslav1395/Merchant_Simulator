package Products;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> products = new ArrayList<>();

    public Products() {
      makeProductArray();
    }

    private void makeProductArray(){
        products.add(new Fabrics(10,3000));
        products.add(new Flour(50, 800));
        products.add(new Grain(50,400));
        products.add(new Meat(5, 3000));
        products.add(new Paint(1, 1000));
        products.add(new DriedFruits(10,500));
    }

    public List<Product> getProducts() {
        return List.copyOf(this.products);
    }
}
