package Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static String findTags(List<String> text) {
        Map<String, Integer> tag = new HashMap<>();

        for (String line : text) {
            String[] arrWords = line.split(" ");
            String[] distinct =
                    Arrays.stream(arrWords)
                            .distinct()
                            .toArray(String[]::new);


            for (String word : distinct) {
                int count = 1;
                if (word.charAt(0) == '#') {
                    if (tag.containsKey(word)) {
                        tag.put(word, tag.get(word) + 1);
                    } else {
                        tag.put(word, count);
                    }
                }
            }
        }
        return tag.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));

    }
}
