package Strings;

public class FindChInStr {//find charater in string.

    public static void main(String[] args) {

        String s = "developer";
        char target = 'p';

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Character found");
        } else {
            System.out.println("Character not found");
        }
    }
}