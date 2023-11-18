package Lab6.Lab6_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = Arrays.asList("a", "b", "c", 2);
        System.out.println(reverseList(list));
    }

    public static <T extends Number> void sumOfEvenAndOddNumbers(List<T> numbers){
        double sumOfEven = 0;
        double sumOfOdd = 0;

        for(T number: numbers){
            if(number.doubleValue() % 2==0){
                sumOfEven += number.doubleValue();
            }else{
                sumOfOdd += number.doubleValue();
            }
        }
        System.out.println("Sum of even numbers is " + sumOfEven);
        System.out.println("Sum of odd numbers is " + sumOfOdd);
    }

    public static <T> List reverseList(List<T> list){
        List newList = new ArrayList<>();
        for(int i = list.size()-1; i>=0; i--){
            newList.add(list.get(i));
        }
        return newList;
    }
}
