package State;

import Enums.Quality;
import Products.Product;

public class Bad extends State{
    public Bad(Product product) {
        super(product);
    }

    @Override
    public void sellProduct() {
        super.getProduct().setPrice(getProduct().getPrice() * Quality.BAD.getCoefficient());
    }

    @Override
    public void lowerTheQuality() {
        super.getProduct().setStateQuality(new Trash(super.getProduct()));
    }
}
