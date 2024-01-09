package Lab11.Task6;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();
        EspressoBuilder espressoBuilder = new EspressoBuilder();
        LatteBuilder latteBuilder = new LatteBuilder();
        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        coffeeDirector.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.buildCoffe();
        System.out.println(latte);
    }
}
