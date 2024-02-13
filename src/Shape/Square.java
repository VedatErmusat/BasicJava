package Shape;

public class Square extends TwoDimensionalShape{
    private double side;

    public Square(double side) {
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
        return side*side;
    }

    @Override
    public String getDescription() {
        return "Kare" + "\n" + "Bir Kenarı: " +getSide();
    }
}
