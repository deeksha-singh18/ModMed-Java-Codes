package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int[] output = sortArray(array);
        for (int i = 0; i < output.length; i++) {
            System.out.println("Element at " + i+ "th index is " + output[i]);

        }

    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter the array elements in one line : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        return array;

    }


    public static int[] sortArray(int[] array){
//        int[] newSortedArray = new int[array.length];

//        for (int i = 0; i < array.length; i++) {
//            newSortedArray[i] = array[i];
//
//        }
        int[] newSortedArray = Arrays.copyOf(array,array.length);
        int temp =0;


        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(newSortedArray[j]<newSortedArray[j+1]){
                    temp = newSortedArray[j+1];
                    newSortedArray[j+1]= newSortedArray[j];
                    newSortedArray[j] = temp;


                }

            }

        }
        return newSortedArray;

    }
}
