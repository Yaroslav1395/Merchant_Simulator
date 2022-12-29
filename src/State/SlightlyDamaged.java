package State;


import Enums.Quality;
import Products.Product;

public class SlightlyDamaged extends State {
    public SlightlyDamaged(Product product) {
        super(product);
    }

    @Override
    public void sellProduct() {
        super.getProduct().setPrice(getProduct().getPrice() * Quality.SLIGHTLY_DAMAGED.getCoefficient());
    }

    @Override
    public void lowerTheQuality() {
        super.getProduct().setStateQuality(new HalfDamaged(super.getProduct()));
    }
}
