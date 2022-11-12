package Tasks;

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


public class Task3Test {
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
        List<Shape> sortedList = Task3.sortedShape(verifiableList);
        Assert.assertEquals(trueList, sortedList);
    }

    @Test
    public void isListOfShapeEmpty() {
        List<Shape> sortedList = Task3.sortedShape(new ArrayList<>());
        Assert.assertEquals(Collections.emptyList(), sortedList);
    }

    @Test(expected = NullPointerException.class)
    public void isListOfShapeNull() {
        Task3.sortedShape(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isNegativeValuesInConstructorShape() {
        List<Shape> errorList = new ArrayList<>(
                List.of(new Cube(-1),
                        new Cylinder(-5, -2),
                        new Sphere(0))
        );
        Task3.sortedShape(errorList);
    }


}