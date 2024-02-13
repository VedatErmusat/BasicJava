package Shape;

public class Cube extends ThreeDimensionalShape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6*side*side;
    }

    @Override
    double getVolume() {
        return side*side*side;
    }

    @Override
    public String getDescription() {
        return "Küp" + "\n" + "Bir Kenarı: " + getSide();
    }
}
