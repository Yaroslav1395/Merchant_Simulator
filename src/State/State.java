package State;

import Products.Product;

public abstract class State {
    private Product product;

    public State() {
    }

    public State(Product product) {
        this.product = product;
    }

    public abstract void sellProduct();
    public abstract void lowerTheQuality();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
