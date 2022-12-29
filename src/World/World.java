package World;

import Dealer.Dealer;
import Store.Store;

import java.util.Random;

public class World {
    private final Store store = new Store();
    private final Dealer dealer = new Dealer();
    private final Random random = new Random();


    public void dealerToStore(){
        this.dealer.buyProducts(this.store);
    }

    public int movePoints(){
        return random.nextInt(5) + 1;
    }
    public void skipDay(){

    }
}
