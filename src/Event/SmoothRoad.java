package Event;

import Dealer.Dealer;

public class SmoothRoad implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("������ ������. �������� ������������ ��������");
        dealer.setSpeed(dealer.getSpeed() + 2);
    }
}
