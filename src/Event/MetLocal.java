package Event;

import Dealer.Dealer;

import java.util.Random;

public class MetLocal implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Встретил местного. Срезал путь");
        dealer.setSpeed(dealer.getSpeed() + new Random().nextInt(7) + 1);
    }
}
