package Event;

import Dealer.Dealer;

public class BrokenWheel implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Сломалось колесо. Простой");
        dealer.setSpeed(0);
    }
}
