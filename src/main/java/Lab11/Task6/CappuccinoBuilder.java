package Lab11.Task6;

import java.util.List;

public class CappuccinoBuilder implements CoffeeBuilder{
    Coffee coffee;

    public CappuccinoBuilder(){
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Cappuccino");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings() {

    }

    public Coffee buildCoffe(){
        return coffee;
    }

}
