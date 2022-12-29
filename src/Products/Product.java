package Products;




import State.*;
import Enums.Quality;

import java.util.Objects;

public class Product {
    private String name;
    private int weight;
    private Quality quality;
    private State stateQuality;
    private double price;


    public Product(int weight, double price) {
        this.weight = weight;
        this.quality = Quality.NORMAL;
        this.stateQuality = new Normal(this);
        this.price = price;
    }

    public Product(String name, int weight, Quality quality, double price) {
        this.name = name;
        this.weight = weight;
        this.quality = Quality.NORMAL;
        this.stateQuality = new Normal(this);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public State getStateQuality() {
        return stateQuality;
    }

    public void setStateQuality(State stateQuality) {
        this.stateQuality = stateQuality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " + name +
                " Вес: " + weight +
                " Состояние: " + quality.getName() +
                " Цена: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight && price == product.price && Objects.equals(name, product.name) && quality == product.quality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, quality, price);
    }
}
