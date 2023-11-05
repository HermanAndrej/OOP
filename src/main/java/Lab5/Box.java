package Lab5;

import java.util.ArrayList;

public class Box{
    private double maxWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> contents;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<ToBeStored>();
        this.currentWeight = 0;
    }

    public void add(ToBeStored item){
        if((currentWeight + item.weight()) > maxWeight){
            System.out.println("Can't add item, maximum weight overreached!");
        }else{
            contents.add(item);
            currentWeight += item.weight();
        }
    }

    @Override
    public String toString() {
        return String.format("Box: %d things, total weight %.2f kg", contents.size(), currentWeight);
    }


}
