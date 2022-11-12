package shapes;

public abstract class Shape implements Comparable <Shape> {
Shape s;
    public abstract double volume();

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.volume(), o.volume());
    }
}
