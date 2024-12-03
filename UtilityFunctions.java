import java.util.*;

/**
 * UtilityFunctions provides methods to generate random lists,
 * count occurrences in a list, and sort a list in ascending order.
 */
public class UtilityFunctions {

    /**
     * Generates a random list of integers of a given size.
     *
     * @param size The size of the list to generate.
     * @return A list of random integers.
     * @throws IllegalArgumentException If the size is negative.
     */
    public static List<Integer> generateRandomList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size must be non-negative.");
        }
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100)); // Random integers from 0 to 99
        }
        return randomList;
    }

    /**
     * Takes a list of integers and returns a map where each integer is a key,
     * and its value is the number of occurrences of that integer in the list.
     *
     * @param list The list of integers to analyze.
     * @return A map of integers and their occurrences.
     */
    public static Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (Integer num : list) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        return occurrenceMap;
    }

    /**
     * Sorts a list of integers in ascending order.
     *
     * @param list The list of integers to sort.
     */
    public static void sortList(List<Integer> list) {
        Collections.sort(list);
    }
}
