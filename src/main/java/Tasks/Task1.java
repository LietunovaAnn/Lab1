package Tasks;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static int[] sortedPositiveArray(int[] arr) {
        return Arrays.stream(arr).boxed()
                .filter(x -> x >= 0)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
