package Event;

import Dealer.Dealer;

public class River implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("”перс€ в реку. »скал брод");
        dealer.setSpeed(0);
    }
}
