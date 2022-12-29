package State;

import Enums.Quality;
import Products.Product;

public class HalfDamaged extends State {

    public HalfDamaged(Product product) {
        super(product);
    }

    @Override
    public void sellProduct() {
        super.getProduct().setPrice(getProduct().getPrice() * Quality.HALF_DAMAGED.getCoefficient());
    }
}