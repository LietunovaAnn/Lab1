package shapes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.text.DecimalFormat;

@Data
public class Cube extends Shape {
    private double edgeLength;

    public Cube(double edgeLength) {
        if (edgeLength <= 0){
            throw new IllegalArgumentException("Parameter edgeLength be not negative");
        }
        this.edgeLength = edgeLength;
    }


    @Override
    public double volume() {
        return Math.pow(edgeLength, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume=" + new DecimalFormat("#0.00").format(volume()) +
                '}';
    }
}
