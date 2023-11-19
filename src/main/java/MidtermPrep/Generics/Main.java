package MidtermPrep.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List listOfNums = new ArrayList<>();

        listOfNums.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(sumOfEvenAndOdd(listOfNums));
        System.out.println(reverseList(listOfNums));
    }
    public static <T> String sumOfEvenAndOdd(List<T> list){
        int sumEven = 0;
        int sumOdd = 0;
        for(T num : list){
            if((Integer) num%2 == 0){
                sumEven += (Integer) num;
            }else{
                sumOdd += (Integer) num;
            }
        }
        return "Sum of even: " + sumEven + " Sum of odd: " + sumOdd;
    }

    public static <G> List reverseList(List<G> list){
        List newList = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            newList.add(list.get(i));
        }
        return newList;
    }
}
