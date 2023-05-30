package arraydatastructure;

/**
 *
 * @author Karishma
 */
public class ArrayOperations {

    //How to search, insert, and delete in an unsorted array
    //************************ Search an Element ************************
    //Time Complexity: O(N) 
    //Auxiliary Space: O(1)
    static int searchElement(int[] array, int length, int key) {

        int pos = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == key) {
                pos = i;
            }
        }
        return pos;
    }

    //*********************** Insert at the end ************************
    static int insertAtEnd(int array[], int n, int key, int capacity) {

        if (n <= capacity) {
            array[n] = key;
            n = n + 1;
        } else {
            System.out.println("It's over the capacity");
        }
        return n;
    }

    //********************** Insert at specific position ***********************
    static void insertMiddle(int array[], int n, int key, int pos) {

        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = key;

    }

    //******************** Delete an element ********************
    static int deleteElement(int[] array1, int length, int key) {

        int pos = searchElement(array1, length, key);

        for (int i = pos; i < length - 1; i++) {
            array1[i] = array1[i + 1];
        }
        return length - 1;
    }

    //****************** Method to print an array ***********************
    static void printArray(int[] array) {

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {6, 10, 2, 4, 15};
        int length = array.length;
        int key = 2;

        printArray(array);

        //Search element in unsorted array
        int pos = searchElement(array, length, key);
        System.out.println(key + " found at index: " + pos);

        //Insert at the end in unsorted array
        int[] array1 = new int[10];
        array1[0] = 5;
        array1[1] = 15;
        array1[2] = 4;
        array1[3] = 2;
        array1[4] = 7;

        int n = 5; //number of element the array
        int capacity = 10;
        int key1 = 66;

        System.out.println("\nBefore Insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }

        n = insertAtEnd(array1, n, key1, capacity);

        System.out.println("\n\nAfter Insertion");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        //**************************** Insert at specific position ***********************
        key = 10;
        int position = 2;

        System.out.println("\nBefore Insertion (Middle)");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }

        insertMiddle(array1, n, key, position);
        n += 1;

        System.out.println("\n\nAfter Insertion (Middle)");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }

        //********************************* Delete an element **********************************
        int[] array2 = {6, 10, 2, 4, 15};
        int length2 = array.length;
        int key2 = 2;
        
        System.out.println("\n\nBefore delete an element");
        printArray(array2);

        n = deleteElement(array2, length2, key2);
        
        System.out.println("After delete an element");
        for(int i = 0; i < n; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

}
