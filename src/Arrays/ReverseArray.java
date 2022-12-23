package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

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


    private static int[] reverseArray(int[] array){
        int[] temp= new int[array.length];
        int j=0;
        for (int i = array.length-1; i>=0 ; i--) {
            temp[j]= array[i];
            j++;

        }
        return temp;


    }


    public static void main(String[] args) {
//        int limit = limitArray();
//        int[] array = getArray(limit);
//        System.out.println("Before Reversing");
//        System.out.println(Arrays.toString(array));
//        int[] output = reverseArray(array);
//        System.out.println("After Reversing");
//        System.out.println(Arrays.toString(output));
        int[] array = {1,2,3,4,5};




    }
}
