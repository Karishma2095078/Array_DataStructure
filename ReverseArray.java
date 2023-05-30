package arraydatastructure;

import java.util.Arrays;

public class ReverseArray {

    //Method to reverse an array
    public void reverseArray(int[] array) {

        //step 1:
        //Initialize start and end indexes as 
        //start = 0, end = n-1
        int n = array.length; //length = 3
        int start = 0;
        int end = n - 1;

        //step 2:
        //In a loop, swap arr[start] with arr[end] and
        //change start and end as follows:
        //start = start + 1, end = end - 1
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    //Method to print an array
    public void printArray(int[] array) {

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        ReverseArray obj1 = new ReverseArray();

        int[] array = {1, 2, 3, 4, 5, 6};

        //prints an array
        System.out.println("Array");
        obj1.printArray(array);

        //reverse an array
        System.out.println("Reverse Array");
        obj1.reverseArray(array);
        obj1.printArray(array);

    }
}
