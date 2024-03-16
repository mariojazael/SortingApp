import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorner(){
        sorting.sort(new int[0]);
        sorting.sort(new int[]{0});
        sorting.sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    }

    @Test
    public void testEmptyCase() {
        int[] actual = new int[0];
        sorting.sort(actual);
        assertArrayEquals(new int[0], actual);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] actual = {3};
        sorting.sort(actual);
        assertArrayEquals(new int[]{3}, actual);
    }

    @Test
    public void testSortedArraysCase() {
        int[] actual = {1, 2, 3};
        sorting.sort(actual);
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    public void testOtherCases() {
        int[] actual = {4, 3, 1, 2, 5};
        sorting.sort(actual);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }
}

