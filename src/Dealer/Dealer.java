package Dealer;

import Enums.Towns;
import Products.Product;
import Store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Dealer {
    private int loadCapacity;
    private int movePoints;
    private double money;
    private List<Product> products = new ArrayList<>();
    private Towns destination;
    private final Random random = new Random();

    public Dealer() {
        this.loadCapacity = 300;
        this.movePoints = random.nextInt(5) + 1;
        this.money = random.nextInt(15000) + 10000;
        this.destination = Towns.values()[random.nextInt(6)];
        this.destination.setDistanceToCity(random.nextInt(100) + 50);
    }
    //----------------------Гетеры и сетеры---------------------------------------------

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getSpeed() {
        return movePoints;
    }

    public void setSpeed(int speed) {
        this.movePoints = speed;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Towns getDestination() {
        return destination;
    }

    public void setDestination(Towns destination) {
        this.destination = destination;
    }

    //---------------------Заполнение телеги продуктами-----------------------------------
    public void buyProducts(Store store){
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
    //----------------------Печать продуктов---------------------------------
    public void printDealerProducts(){
        System.out.println("Денег у продавца: " + this.money);
        System.out.println("Вместимость телеги: " + this.loadCapacity);
        System.out.println("Список товаров продавца");
        for (Product product: this.products) {
            System.out.println(product);
        }
    }
}
