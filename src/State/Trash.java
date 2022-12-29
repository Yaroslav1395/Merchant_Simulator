package State;

import Enums.Quality;
import Products.Product;

public class Trash extends State{
    public Trash(Product product) {
        super(product);
    }

    @Override
    public void sellProduct() {
        super.getProduct().setPrice(getProduct().getPrice() * Quality.TRASH.getCoefficient());
    }
}
