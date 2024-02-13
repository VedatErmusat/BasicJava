package Shape;

public class Test {
    public static void main(String[] args) {
        Shape circleObj = new Circle(2);
        Shape squareObj = new Square(3) ;
        Shape triangleObj = new Triangle(5,2);
        Shape sphereObj = new Sphere(2);
        Shape cubeObj = new Cube(3);
        Shape tetrahedronObj = new Tetrahedron(3,4,5);

        Shape[] shapes = new Shape[6];
        shapes[0] = circleObj;
        shapes[1] = squareObj;
        shapes[2] = triangleObj;
        shapes[3] = sphereObj;
        shapes[4] = cubeObj;
        shapes[5] = tetrahedronObj;

        // Her bir şekil için bilgileri yazdırcak
        for(Shape value:shapes){
            System.out.println(value.getDescription()); //instanceof operatörü bir objenin belirli bir sınıfa ait olup olmadığını kontrol eder. Kalıtımı da hesaba kadar. Böyle bir kontrole birçok durumda ihtiyacımız olabilir. Aşağıda polymorphic fonksiyon inşa etmek için, argümanların tipine göre farklı davranış sergileyen bir yapı yer almaktadır.
            // Eğer TwoDimensionalShape ise alanını yazdırcak
            if (value instanceof TwoDimensionalShape){
                TwoDimensionalShape ikiBoyutlular = (TwoDimensionalShape) value;
                System.out.println("Alan: " + ikiBoyutlular.getArea());
            }
            // Eğer ThreeDimensionalShape ise alan ve hacmini yazdırcak
            if (value instanceof ThreeDimensionalShape){
                ThreeDimensionalShape ucBoyutlular = (ThreeDimensionalShape) value;
                System.out.println("Alan: " + ucBoyutlular.getArea());
                System.out.println("Hacim: " + ucBoyutlular.getVolume());
            }
            System.out.println(); // Her şekil arasına bir boş satır eklemek için
        }
    }
}
