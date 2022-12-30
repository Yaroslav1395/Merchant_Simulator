package Event;

import Dealer.Dealer;

import java.util.Random;

public class Rain implements Eventable{

    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("����� �����");
        dealer.setMovePoints(Math.max(dealer.getMovePoints() - 2, 0));
        Random random = new Random();
        if(random.nextInt(3) + 1 == 3){
            System.out.println("����� ����������");
            dealer.getProducts().get(random.nextInt(dealer.getProducts().size())).getStateQuality().lowerTheQuality();
        }
    }
}