package arraydatastructure;

import java.util.Arrays;

/**
 *
 * @author Karishma
 */
public class FindMinMaxArray {

    //Method to find minimum and maximum element in the array
    static void findMinMax(int[] array) {

        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length - 1];

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);

    }

    //Method to print an array
    static void printArray(int[] array) {

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array1 = {6, 10, 2, 4, 15};

        //Find minimum and maximum
        System.out.println("Find minimum and maximum element");
        printArray(array1);
        findMinMax(array1);
    }

}
