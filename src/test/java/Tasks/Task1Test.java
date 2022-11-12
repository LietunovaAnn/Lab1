package Tasks;

import org.junit.Assert;
import org.junit.Test;


public class Task1Test {
    @Test
    public void compareSortedPositiveArray() {
        int[] trueArray = {99, 71, 20, 5, 3};
        int[] verifiableArray = {-5, 5, 3, -44, 71, 99, 20};
        int[] sortedArray = Task1.sortedPositiveArray(verifiableArray);
        Assert.assertArrayEquals(trueArray, sortedArray);
    }

    @Test
    public void isNegativeArray() {
        int[] emptyArray = new int[0];
        int[] verifiableArray = {-5, -5, -44, -7, -199, -20};
        int[] sortedArray = Task1.sortedPositiveArray(verifiableArray);
        Assert.assertArrayEquals(emptyArray, sortedArray);
    }

    @Test
    public void isEmptyArray() {
        int[] empty = new int[0];
        int[] sortedArray = Task1.sortedPositiveArray(empty);
        Assert.assertArrayEquals(empty, sortedArray);
    }

    @Test(expected = NullPointerException.class)
    public void isArrayNull() {
        Task1.sortedPositiveArray(null);
    }

}