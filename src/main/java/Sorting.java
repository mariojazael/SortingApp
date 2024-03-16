
public class Sorting {
    public void sort(int[] array) {
        if (array == null || array.length <= 1 || array.length > 10) throw new IllegalArgumentException();

        // No need to throw IllegalArgumentException for empty or single-element arrays
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
