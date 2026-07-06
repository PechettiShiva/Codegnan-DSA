package SearchingAlgorithms;

public class FindBinNum {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } 
            else if (target < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}