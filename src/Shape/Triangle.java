package Shape;

public class Triangle extends TwoDimensionalShape{
    private double side,height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return (side*height)/2;
    }

    @Override
    public String getDescription() {
        return "Üçgen" + "\n" + "Bir Kenarı: " + getSide() + "\n" + "Yüksekliği: " +getHeight();
    }
}
