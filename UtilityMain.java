import java.util.*;

/**
 * Main class to demonstrate the functionality of UtilityFunctions.
 */
public class UtilityMain {
    public static void main(String[] args) {
        // Generate a random list of integers
        List<Integer> randomList = UtilityFunctions.generateRandomList(10);
        System.out.println("Random List: " + randomList);

        // Count occurrences in the random list
        Map<Integer, Integer> occurrences = UtilityFunctions.countOccurrences(randomList);
        System.out.println("Occurrences: " + occurrences);

        // Sort the list in ascending order
        UtilityFunctions.sortList(randomList);
        System.out.println("Sorted List: " + randomList);
    }
}
