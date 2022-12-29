package Dealer;

import Enums.Towns;
import Products.Product;
import Store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Dealer {
    private int loadCapacity;
    private int speed;
    private int money;
    private List<Product> products = new ArrayList<>();

    private Towns destination;
    private final Random random = new Random();

    public Dealer() {
        this.loadCapacity = 300;
        this.speed = random.nextInt(3) + 2;
        this.money = random.nextInt(15000) + 10000;
        this.destination = Towns.values()[random.nextInt(6)];
        this.destination.setDistanceToCity(random.nextInt(100) + 50);
    }
    //----------------------������ � ������---------------------------------------------

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //---------------------���������� ������ ����������-----------------------------------
    public void buyProducts(){
        Store store = new Store();
        boolean isFull = false;
        while (!isFull){
            Product product = store.getProducts().get(random.nextInt(store.getProducts().size()));
            if((this.loadCapacity - product.getWeight()) <= 0 || this.money - product.getPrice() <= 0){
                isFull = true;
            }
            else {
                this.products.add(product);
                this.loadCapacity -= product.getWeight();
                this.money -= product.getPrice();
                store.removeProduct(product);
                store.setLoadCapacity(store.getLoadCapacity() + product.getWeight());
            }
        }
    }
    //----------------------������ ���������---------------------------------
    public void printDealerProducts(){
        System.out.println("����� � ��������: " + this.money);
        System.out.println("����������� ������: " + this.loadCapacity);
        System.out.println("������ ������� ��������");
        for (Product product: this.products) {
            System.out.println(product);
        }
    }
}
