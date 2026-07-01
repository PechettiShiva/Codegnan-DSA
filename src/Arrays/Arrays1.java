package Arrays;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 9, 2, 47};
        int pos = 3;
        int ele = 88;

        // Creating new array
        int[] newArray = new int[arr.length + 1];

        // Copy elements before position
        for(int i = 0; i < pos; i++) {
            newArray[i] = arr[i];
        }

        // Insert element
        newArray[pos] = ele;

        // Copy remaining elements
        for(int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        System.out.println("Old Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}