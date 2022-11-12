package shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Parameters radius and height be not negative");
        }
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.pow(radius, 2) * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + String.format("%.2f", volume()) +
                '}';
    }
}
