import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import shapes.Cube;
import shapes.Cylinder;
import shapes.Shape;
import shapes.Sphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("First task");
        int[] array = {3, 1, 5, 6, 8, -1, 5, 0};
        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Sorted positive array " + Arrays.toString(Task1.sortedPositiveArray(array)));
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
        System.out.println("Top 5 tags\n" + Task2.findTags(text));
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
        System.out.println("Sorted shapes " + Task3.sortedShape(shape));
        System.out.println("-------------------------------------------------");
    }

}
