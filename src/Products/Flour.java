package Products;

import Enums.Quality;

public class Flour extends Product{
    public Flour(int weight, double price) {
        super(weight, price);
        this.setName("Мука");
    }
}
