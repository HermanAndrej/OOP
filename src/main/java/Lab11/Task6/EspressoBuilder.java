package Lab11.Task6;

import java.util.List;

public class EspressoBuilder implements CoffeeBuilder{
    Coffee coffee;

    public EspressoBuilder(){
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Espresso");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Small");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Chocolate");
    }

    public Coffee buildCoffe(){
        return coffee;
    }

}
