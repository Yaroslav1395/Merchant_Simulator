package Store;


import Products.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private List<Product> products = new ArrayList<>();
    private int loadCapacity = 2000;

    public Store() {
        fillStoreByProducts();
    }

    //------------------Гетеры и сетеры-------------------------------------


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //----------------Заполнение магазина товаром----------------------------
    private Product[] makeProductArray(){
        Product[] products = new Product[6];
        products[0] = new Fabrics(10,3000);
        products[1] = new Flour(50, 800);
        products[2] = new Grain(50,400);
        products[3] = new Meat(5, 3000);
        products[4] = new Paint(1, 1000);
        products[5] = new DriedFruits(10,500);
        return products;
    }

    private Product returnOneProduct(){
        Product[] products = makeProductArray();
        Random random = new Random();
        Product randomProduct = products[random.nextInt(5)];
        return  new Product(
                randomProduct.getName(),
                randomProduct.getWeight(),
                randomProduct.getQuality(),
                randomProduct.getPrice());
    }
    private void fillStoreByProducts(){
        int addCount = -1;
        boolean isFull = false;
        while (!isFull){
            addCount += 1;
            this.products.add(returnOneProduct());
            if((this.loadCapacity - this.products.get(addCount).getWeight()) <= 0){
                this.products.remove(addCount);
                isFull = true;
            }
            else {
                this.loadCapacity -= this.products.get(addCount).getWeight();
            }
        }
    }
    //----------------Печать списка продуктов --------------------------------
    public void printProductInStore(){
        int moneyInProduct = 0;
        for (Product product: this.products) {
            System.out.println(product);
            moneyInProduct += product.getPrice();
        }
        System.out.println("Денег в товаре: " + moneyInProduct);
        System.out.println("Свободное место на складе: " + this.loadCapacity);
    }
    //------------------Удаление продукта из списка----------------------------
    public void removeProduct(Product product){
        this.products.remove(product);
    }
}
