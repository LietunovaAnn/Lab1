package Tasks;

import shapes.Shape;

import java.util.Collections;
import java.util.List;

public class Task3 {

    public static List<Shape> sortedShape(List<Shape> shapes) {
        Collections.sort(shapes);
        return shapes;
    }
}
