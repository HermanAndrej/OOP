package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    private double maxWeight;
    private List<Thing> things;
    private double currentWeight;
    public MaxWeightBox(double maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
        this.currentWeight = 0;
    }
    @Override
    public void add(Thing thing) {
        if((thing.getWeight() + currentWeight) <= maxWeight){
            things.add(thing);
        }
        currentWeight += thing.getWeight();
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
