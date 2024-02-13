package Shape;

public class Circle extends TwoDimensionalShape{,
    private double radius;
    private double pi=3.14;
    public Circle(double radius) {
        this.radius = radius;
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    @Override
    String getDescription() {
        return "Daire" + "\n"+ "Yarıçapı: " + getRadius();
    }

    @Override
    double getArea() {
        return pi*radius*radius;
    }
}
