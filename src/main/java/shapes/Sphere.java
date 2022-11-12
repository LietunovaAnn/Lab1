package shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DecimalFormat;

@Data
public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Parameter radius be not negative");
        }
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4 / 3 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "volume=" + new DecimalFormat("#0.00").format(volume()) +
                '}';
    }
}
