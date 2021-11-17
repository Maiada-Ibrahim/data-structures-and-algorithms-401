/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void quickTest() {
        int[] arr = {8,4,23,42,16,15};
        App.QuickSort(arr,0,arr.length-1);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(arr));
    }

    @Test void nearlySortedTest() {
        int[] arr = {2,3,5,7,13,11};
        App.QuickSort(arr,0,arr.length-1);
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(arr));
    }

    @Test void negativeIntegersTest() {
        int[] arr = {-2,-3,-5,-7,-13,-11};
        App.QuickSort(arr,0,arr.length-1);
        assertEquals("[-13, -11, -7, -5, -3, -2]", Arrays.toString(arr));
    }

    @Test void emptyArrTest() {
        int[] arr = {};
        App.QuickSort(arr,0,arr.length-1);
        assertEquals("[]", Arrays.toString(arr));
    }
}
