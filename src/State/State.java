package State;

import Products.Product;

public abstract class State {
    private Product product;

    public State(Product product) {
        this.product = product;
    }

    public abstract void sellProduct();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
