package Event;

import Dealer.Dealer;

public class SmoothRoad implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Ровная дорога. Скорость передвижения повышена");
        dealer.setMovePoints(dealer.getMovePoints() + 5);
    }
}
