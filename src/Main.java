import Dealer.Dealer;
import Enums.Quality;
import Products.Product;
import Store.Store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.buyProducts();
        dealer.getProducts().get(0).getStateQuality().sellProduct();
        System.out.println(dealer.getProducts().get(0));
    }
}
