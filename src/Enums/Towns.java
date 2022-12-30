package Enums;

import Products.Product;
import Products.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Towns {
    MOSCOW,
    BERLIN,
    ROME,
    KIEV,
    PARIS,
    MADRID;

    private int distanceToCity;
    private final List<Product> highDemandProducts = new ArrayList<>();
    private final Random random = new Random();

    Towns() {
        makeHighDemandProducts();
        randomDistanceToCity();
    }

    public int getDistanceToCity() {
        return distanceToCity;
    }

    public void setDistanceToCity(int distanceToCity) {
        this.distanceToCity = distanceToCity;
    }

    public List<Product> getHighDemandProducts() {
        return highDemandProducts;
    }

    private void makeHighDemandProducts(){
        Products products = new Products();
        int randomNumber = random.nextInt(3) + 1;
        while (randomNumber > 0){
            highDemandProducts.add(products.getProducts().get(random.nextInt(products.getProducts().size())));
            randomNumber --;
        }
    }
    private void randomDistanceToCity(){
        this.distanceToCity =  random.nextInt(100) + 50;
    }

}
