package Event;

import Dealer.Dealer;

public class BrokenWheel implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("��������� ������. �������");
        dealer.setSpeed(0);
    }
}
