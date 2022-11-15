package Arrays;
import java.util.Scanner;
public class Array {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//
//        for (int i = 0; i < 10; i++) {
//            arr[i] = i*10;
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }

        int[] array = getIntegers(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + i + "th index is " + array[i]);

        }
        System.out.println("The average is " + getAverage(array));
    }

        public static int[] getIntegers(int number){
            int[] array = new int[number];
            System.out.println("Enter the array elements : ");

            for (int i = 0; i < number; i++) {

                array[i] = sc.nextInt();
            }

            return array;

        }


        public static double getAverage(int[] array){
           int sum=0;
            for (int i = 0; i < array.length; i++) {
                sum+=array[i];

            }
            double avg = sum/array.length;
            return  avg;
        }




}
