package SearchingAlgorithms;

public class FindBinName {

    public static void main(String[] args) {

        String name[] = {"bahu", "bali", "deva", "seena"};
        String target = "deva";

        int low = 0;
        int high = name.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = target.compareTo(name[mid]);

            if (result == 0) {
                System.out.println("Found at index: " + mid);
                return;
            } 
            else if (result < 0) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        System.out.println("Name not found");
    }
}