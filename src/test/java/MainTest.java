import org.junit.Assert;
import org.junit.Test;
import shapes.Cube;
import shapes.Cylinder;
import shapes.Shape;
import shapes.Sphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest {

    //Test task1
    @Test
    public void compareSortedPositiveArray() {
        int[] trueArray = {99, 71, 20, 5, 3};
        int[] verifiableArray = {-5, 5, 3, -44, 71, 99, 20};
        int[] sortedArray = Main.sortedPositiveArray(verifiableArray);
        Assert.assertArrayEquals(trueArray, sortedArray);
    }

    @Test
    public void isNegativeArray() {
        int[] emptyArray = new int[0];
        int[] verifiableArray = {-5, -5, -44, -7, -199, -20};
        int[] sortedArray = Main.sortedPositiveArray(verifiableArray);
        Assert.assertArrayEquals(emptyArray, sortedArray);
    }
    @Test
    public void isEmptyArray() {
        int[] empty = new int[0];
        int[] sortedArray = Main.sortedPositiveArray(empty);
        Assert.assertArrayEquals(empty, sortedArray);
    }

    @Test(expected = NullPointerException.class)
    public void isArrayNull() {
        Main.sortedPositiveArray(null);
    }

    //Test task2
    @Test
    public void compareSortedListTags() {
        String trueTags = "#B=4\n#A=3\n#N=2\n#M=1\n#AM=1";
        List<String> tags = new ArrayList<>(
                List.of("#A #A #B",
                        "#A #B",
                        "#N #B",
                        "#AM #N #A",
                        "#M #B"
                        )
        );
        String sortedTags = Main.findTags(tags);
        Assert.assertEquals(trueTags, sortedTags);
    }
    @Test
    public void checkForDuplicates() {
        String trueTags = "#A#A=1\n#A=1";
        List<String> tags = new ArrayList<>(
                List.of("#A #A#A #A#A #A#A #A#A #A")
        );
        String sortedTags = Main.findTags(tags);
        Assert.assertEquals(trueTags, sortedTags);
    }

    @Test
    public void isListTagsEmpty() {
        List<String> emptyList = new ArrayList<>();
        String s = Main.findTags(emptyList);
        Assert.assertEquals("", s);
    }

    @Test(expected = NullPointerException.class)
    public void isListTagsNull() {
        Main.findTags(null);
    }

    //Test task3
    @Test
    public void compareSortedShape() {
        List<Shape> trueList = new ArrayList<>(
                Arrays.asList(new Cube(1),
                        new Sphere(5),
                        new Cylinder(2, 2)));
        List<Shape> verifiableList = new ArrayList<>(
                Arrays.asList(new Sphere(5),
                        new Cylinder(2, 2),
                        new Cube(1)));
        List<Shape> sortedList = Main.sortedShape(verifiableList);
        Assert.assertEquals(trueList, sortedList);
    }

    @Test
    public void isListOfShapeEmpty() {
        List<Shape> sortedList = Main.sortedShape(new ArrayList<>());
        Assert.assertEquals(Collections.emptyList(), sortedList);
    }

    @Test(expected = NullPointerException.class)
    public void isListOfShapeNull() {
        Main.sortedShape(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isNegativeValuesInConstructorShape() {
        List<Shape> errorList = new ArrayList<>(
                List.of(new Cube(-1),
                        new Cylinder(-5, -2),
                        new Sphere(0))
        );
        Main.sortedShape(errorList);
    }


}