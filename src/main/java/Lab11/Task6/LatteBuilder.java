package Lab11.Task6;

import java.util.List;

public class LatteBuilder implements CoffeeBuilder{
    Coffee coffee;

    public LatteBuilder(){
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Vanilla");
        coffee.addTopping("Sprinkles");
    }

    public Coffee buildCoffe(){
        return coffee;
    }

}
