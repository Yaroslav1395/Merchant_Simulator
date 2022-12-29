package Event;

import Dealer.Dealer;

import java.util.Random;

public class Rain implements Eventable{

    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Ровная дорога. Скорость передвижения повышена");
        dealer.setSpeed(dealer.getSpeed() - 2);
        Random random = new Random();
        if(random.nextInt(3) + 1 == 3){
            System.out.println("Товар испортился");
            dealer.getProducts().get(random.nextInt(dealer.getProducts().size())).getStateQuality().lowerTheQuality();
        }
    }
}