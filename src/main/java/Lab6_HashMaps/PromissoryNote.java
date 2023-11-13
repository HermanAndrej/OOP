package Lab6_HashMaps;

import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> hashmap;

    public PromissoryNote(){
        this.hashmap = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        if(hashmap.containsValue(toWhom)){
            hashmap.remove(toWhom);
        }
        hashmap.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        Double debt = hashmap.get(whose);
        if(debt != null){
            return debt;
        }else{
            return 0;
        }
    }
}
