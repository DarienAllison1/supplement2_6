import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the UtilityFunctions class.
 */
public class UtilityFunctionsTest {

    /**
     * Tests the generateRandomList method for correct size and randomness.
     */
    @Test
    public void testGenerateRandomList() {
        List<Integer> randomList = UtilityFunctions.generateRandomList(6);
        assertEquals(6, randomList.size(), "Generated list should have the correct size.");
    }

    /**
     * Tests the countOccurrences method for correct mapping.
     */
    @Test
    public void testCountOccurrences() {
        List<Integer> list = Arrays.asList(4, 5, 5, 6, 6, 6);
        Map<Integer, Integer> occurrences = UtilityFunctions.countOccurrences(list);

        assertEquals(1, occurrences.get(4), "Occurrences of 4 should be correct.");
        assertEquals(2, occurrences.get(5), "Occurrences of 5 should be correct.");
        assertEquals(3, occurrences.get(6), "Occurrences of 6 should be correct.");
    }

    /**
     * Tests the sortList method for sorting correctness.
     */
    @Test
    public void testSortList() {
        List<Integer> list = Arrays.asList(8, 3, 7, 2, 9, 1);
        UtilityFunctions.sortList(list);

        assertEquals(Arrays.asList(1, 2, 3, 7, 8, 9), list, "List should be sorted in ascending order.");
    }
}

