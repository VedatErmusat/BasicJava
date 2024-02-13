package Shape;

public class Sphere extends ThreeDimensionalShape{
    private double radius;
    private double pi = 3.14;

    public Sphere(double radius) {
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
    double getArea() {
        return 4.0*pi*radius*radius;
    }

    @Override
    double getVolume() {
        return (4.0*pi*radius*radius*radius)/3.0;
    }

    @Override
    public String getDescription() {
        return "Küre" + "\n" + "Yarıçapı: " + getRadius();
    }
}
