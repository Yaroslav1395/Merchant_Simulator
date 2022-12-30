package World;

import Dealer.Dealer;
import Event.EventRealize;
import Store.Store;

import java.util.Random;

public class World {
    private final Store store = new Store();
    private final Dealer dealer = new Dealer();
    private final Random random = new Random();

    public World() {
        dealerToStore();
    }

    private void dealerToStore(){
        this.dealer.buyProducts(this.store);
    }

    private int movePoints(){
        return random.nextInt(5) + 1;
    }
    private void setMovePointsToDealer(){
        this.dealer.setMovePoints(movePoints());
    }
    private void skipDay(){
        int randomNumber = new Random().nextInt(EventRealize.values().length);
        EventRealize.getEventRealize(randomNumber).getEvent().realizeEvent(this.dealer);
        this.dealer.dealerMove();
        this.dealer.printDealerInformation();
        setMovePointsToDealer();
    }
    public void simulate(){
        boolean isFinish = false;
        while (!isFinish){
            if(this.dealer.getDestination().getDistanceToCity() > 0){
                skipDay();
            }
            else {
                isFinish = true;
            }
        }
    }
}
