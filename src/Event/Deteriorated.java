package Event;

import Dealer.Dealer;

import java.util.Random;

public class Deteriorated implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("����� ����������");
        dealer.getProducts().get(new Random().nextInt(dealer.getProducts().size())).getStateQuality().lowerTheQuality();
    }
}
