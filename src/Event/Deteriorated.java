package Event;

import Dealer.Dealer;

import java.util.Random;

public class Deteriorated implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Товар испортился");
        int randomNumber = new Random().nextInt(dealer.getProducts().size());
        dealer.getProducts().get(randomNumber).getStateQuality().lowerTheQuality();
    }
}
