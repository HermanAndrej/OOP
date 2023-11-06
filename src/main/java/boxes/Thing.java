package boxes;

public class Thing {
    private String name;
    private double weight;
    public Thing(String name, double weight){
        this.name = name;
        if(weight < 0){
            throw new IllegalArgumentException("Weight can't be negative!");
        }else{
            this.weight = weight;
        }
    }

    public Thing(String name){
        this.name = name;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Thing thing = (Thing) obj;
        return name.equals(thing.name);
    }
}
