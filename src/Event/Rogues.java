package Event;

import Dealer.Dealer;
import Products.Product;
import State.Normal;

import java.util.List;

public class Rogues implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Разбойники");
        if(dealer.getMoney() > 401){
            System.out.println("Откупился деньгами");
            dealer.setMoney(dealer.getMoney() - 400);
        }
        else if(dealer.getMoney() < 401){
            dealer.setMoney(0);
            System.out.println("Откупился деньгами");
        }
        else {
            List<Product> products = dealer.getProducts();
            for (Product product: products) {
                if(product.getStateQuality().equals(new Normal())){
                    dealer.getProducts().remove(product);
                    System.out.println("Забрали товар");
                    break;
                }
            }
        }
    }
}
