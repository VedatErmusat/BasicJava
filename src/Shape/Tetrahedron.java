package Shape;

public class Tetrahedron extends ThreeDimensionalShape{
    private double side, side2, Weight;

    public Tetrahedron(double side, double side2, double weight) {
        this.side = side;
        this.side2 = side2;
        Weight = weight;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    double getArea() {
        return (side*side2)/2;
    }

    @Override
    double getVolume() {
        return (side*side2*Weight)/2;
    }

    @Override
    public String getDescription() {
        return "Piramit" + "\n" + "İlk Kenarı: " + getSide() + "\n" + "İkinci Kenarı: " +getSide2() + "\n" + "Genişliği(Uzun Kenarı): " +getWeight();
    }
}
