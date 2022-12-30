package Event;

import Dealer.Dealer;
import Enums.Towns;
import Products.Product;

import java.util.Random;

public class TavernWithRumors implements Eventable{
    @Override
    public void realizeEvent(Dealer dealer) {
        System.out.println("Ходят слухи. Надо проверить");
        Towns town = Towns.values()[new Random().nextInt(Towns.values().length)];
        System.out.println("В городе " + town.name() + " срочно нужен следующий товар: ");
        for (Product product: town.getHighDemandProducts()) {
            System.out.println(product);
        }
        profitability(dealer, town);
    }
    private int distanceSum(Towns town, Dealer dealer){
        return (int) Math.round((dealer.getDistanceTraveled() / 4f) + (town.getDistanceToCity() * 0.66));
    }
    private int productComparing(Dealer dealer, Towns towns){
        int concurrenceCount = 0;
        for (Product product: dealer.getProducts()) {
            for (Product productTown: towns.getHighDemandProducts()) {
                if(product.equals(productTown)){
                    concurrenceCount++;
                }
            }
        }
        return concurrenceCount;
    }
    private int moneySum(Towns town){
        int sum = 0;
        for (Product product: town.getHighDemandProducts()) {
            sum += product.getPrice();
        }
        return sum;
    }
    private void profitability(Dealer dealer, Towns town){
        int distanceToNewCity = distanceSum(town, dealer);
        int oldCityMatchProduct = productComparing(dealer, dealer.getDestination());
        int newCityMatchProduct = productComparing(dealer, town);
        int oldCityMoneySum = moneySum(dealer.getDestination());
        int newCityMoneySum = moneySum(town);
        if(distanceToNewCity < dealer.getDestination().getDistanceToCity() && oldCityMatchProduct < newCityMatchProduct
                || oldCityMatchProduct < newCityMatchProduct && oldCityMoneySum < newCityMoneySum){
            System.out.println("Изменили город назначения");
            dealer.setDestination(town);
        }
        else {
            System.out.println("Менять город нерентабельно");
        }
    }
}
