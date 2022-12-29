package Event;

import Dealer.Dealer;
import Products.Product;

import java.util.Random;

public class Inn implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("��������� �� ��������");
        Random random =  new Random();
        if(random.nextInt(2) + 1 == 2){
            System.out.println("������� �����");
            Product product = dealer.getProducts().get(random.nextInt(dealer.getProducts().size()));
            product.getStateQuality().sellProduct();
            dealer.getProducts().remove(product);
            dealer.setMoney(dealer.getMoney() + product.getPrice());
        }
        else {
            System.out.println("������ �� �������");
        }
        if(dealer.getMoney() > 10){
            dealer.setMoney(dealer.getMoney() - 10);
            System.out.println("�������� �� ������");
        }
    }
}
