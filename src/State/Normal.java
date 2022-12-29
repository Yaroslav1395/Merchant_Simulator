package State;

import Enums.Quality;
import Products.Product;

public class Normal extends State {
    public Normal(Product product) {
        super(product);
    }

    @Override
    public void sellProduct() {
        super.getProduct().setPrice(getProduct().getPrice() * Quality.NORMAL.getCoefficient());
    }
}
