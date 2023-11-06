package boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{
    private List<Thing> things;
    public OneThingBox(){
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if(things.size() < 1){
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
