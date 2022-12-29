package Products;

import Enums.Quality;

public class Grain extends Product{

    public Grain(int weight, double price) {
        super(weight, price);
        this.setName("Зерно");
    }
}
