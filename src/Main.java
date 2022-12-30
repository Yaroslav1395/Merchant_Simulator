import Dealer.Dealer;
import Enums.Quality;
import Enums.Towns;
import Products.Product;
import Store.Store;
import World.World;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.simulate();
    }
}
