package Lab11.Task6;

import java.util.List;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder){
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}
