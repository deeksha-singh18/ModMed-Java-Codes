package Arrays;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner sc = new Scanner(System.in);


    private static int limitArray(){
        System.out.println("Enter the range of array elements: ");
        int range = sc.nextInt();
        return range;

    }


    private static int[] getArray(int range){
        System.out.println("Enter the array elements: ");
        int[] array = new int[range];
        for (int i = 0; i < range; i++) {
            array[i] = sc.nextInt();

        }
        return array;
    }


    private static int minElement(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }

        }
        return min;
    }


    public static void main(String[] args) {


        int limit = limitArray();
        int[] array = getArray(limit);
        int output = minElement(array);
        System.out.println("The minimum element of the array is " + output);
    }
}
