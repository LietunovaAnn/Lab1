import shapes.Cube;
import shapes.Cylinder;
import shapes.Shape;
import shapes.Sphere;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("First task");
        int[] array = {3, 1, 5, 6, 8, -1, 5, 0};
        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Sorted positive array " + Arrays.toString(sortedPositiveArray(array)));
        System.out.println("-------------------------------------------------");


        System.out.println("Second task");
        List<String> text = new ArrayList<>(
                List.of(
                        "This #A new",
                        "chery berry #B one",
                        "<first> #V oooo",
                        "hgjg< #V buy car",
                        "slowly #V #new hjk",
                        "!!! bounty #V hjk",
                        "This #A #a hjk",
                        "hgjg< #A #A #A , hjk",
                        "hgjg< #C #h hjk",
                        "This #FSFS #h hjk",
                        "hgjg< #B #g hjk",
                        "This< #B #B hjk",
                        "hgjg< #B #B #B hjk",
                        "<first> #V oooo",
                        "hgjg< #V buy car",
                        "slowly #V hjk"
                )
        );
        System.out.println("Top 5 tags\n" + findTags(text));
        System.out.println("-------------------------------------------------");


        System.out.println("Third task");
        List<Shape> shape = new ArrayList<>();
        shape.add(new Cube(4));
        shape.add(new Cylinder(12, 15));
        shape.add(new Sphere(8));
        shape.add(new Cube(4.3));
        shape.add(new Cylinder(7, 6));
        shape.add(new Sphere(1));

        System.out.println("Shapes " + shape);
        System.out.println("Sorted shapes " + sortedShape(shape));
        System.out.println("-------------------------------------------------");
    }

    // Method for task1
    public static int[] sortedPositiveArray(int[] arr) {
        return Arrays.stream(arr).boxed()
                .filter(x -> x >= 0)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // Method for task3
    public static List<Shape> sortedShape(List<Shape> shapes) {
        Collections.sort(shapes);
        return shapes;
    }

    // Method for task2
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

    public static String tags2(List<String> text) {
        Map<String, Integer> result = new HashMap<>();

        for (String line : text) {
            String[] arrWords = line.split(" ");
            Map<String, Integer> lineHashMap = new HashMap<>();
            for (String word : arrWords) {
                if (word.charAt(0) == '#') {
                    if (!lineHashMap.containsKey(word)) {
                        lineHashMap.put(word, 1);
                        if (result.containsKey(word)) {
                            result.put(word, result.get(word) + 1);
                        } else {
                            result.put(word, 1);
                        }
                    }
                }
            }
        }
        return result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));

    }


}
