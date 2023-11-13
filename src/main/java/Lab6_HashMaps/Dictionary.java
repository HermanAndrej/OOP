package Lab6_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> hashmap;

    public Dictionary(){
        this.hashmap = new HashMap<>();
    }

    public HashMap getHashMap(){
        return this.hashmap;
    }

    public String translate(String word){
        if(hashmap.containsKey(word)) {
            return hashmap.get(word);
        }else{
            return null;
        }
    }

    public void add(String word, String translation){
        hashmap.put(word, translation);
    }

    public int amountOfWords(){
        return hashmap.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> arr = new ArrayList<>();
        for(String i: hashmap.keySet()){
            arr.add(i + " = " + hashmap.get(i));
        }
        return arr;
    }
}