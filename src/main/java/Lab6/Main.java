package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

        int[] values = {3, 2, 5, 4, 8};
        System.out.println( Arrays.toString(values) );
        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );
        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );


        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);
        System.out.print("Values of the array: " + Arrays. toString(array));
        System.out.println();
        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        if(result){
            System.out.println("Value " + searchedValue + " is in the array!");
        }else{
            System.out.println("Value " + searchedValue + " is not in the array!");
        }
         */
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);

    }

    public static void printElegantly(int[] array){
        System.out.print(array[0]);
        for(int i = 1; i<array.length; i++){
            System.out.print(", " + array[i]);
        }
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int idx = 0;
        for (int i = 0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int idx = 0;
        for(int i = index; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        for(int i = 0; i<array.length; i++) {
            if (array[i] == min) {
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;
        for(int i = 0; i<array.length; i++){
            if(i == index1){
                temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
        }
    }
}


