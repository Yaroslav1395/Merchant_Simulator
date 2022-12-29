package Event;

import Dealer.Dealer;

public class TypicalDay implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Обычный день. Ничего не произошло");
    }
}
