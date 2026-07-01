package Arrays;

import java.util.Arrays;

public class UpdateArray2 {

    public static void updateElement(int arr[], int size, int position, int newVal) {
        if (position < 0 || position >= size) {//checking position it not negative and position greater than or equal to size
            System.out.println("Invalid position");
        } else {
            arr[position] = newVal; //updating new value in it's position
            System.out.println("Updated data at position " + position + " : " + newVal);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 3, 9};
        int position = 3;

        UpdateArray2.updateElement(arr, arr.length, position, 77); //calling method name with class name and initialzing their values.

        System.out.println(Arrays.toString(arr));
    }
}