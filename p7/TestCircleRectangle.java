public class TestCircleRectangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(3);
        System.out.println("Круг " + circle1.toString());
        System.out.println("Радиус равен " + circle1.getRadius());
        System.out.println("Площадь равна " + circle1.getArea());
        System.out.println("Диаметр равен " + circle1.getDiameter());
        System.out.println("Больше круг с площадью: " + GeometricObject.max(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(2, 8);
        System.out.println("\nПрямоугольник " + rectangle1.toString());
        System.out.println("Площадь равна " + rectangle1.getArea());
        System.out.println("Периметр равен " + rectangle1.getPerimeter());
        System.out.println("Больше прямоугольник с площадью: " + GeometricObject.max(rectangle1, rectangle2));


        ComparableCircle comparableCircle = new ComparableCircle();
        System.out.println("\n\nБольше фигура с площадью: " + comparableCircle.compareTo(circle1, rectangle1));

        Triangle triangle = new Triangle(1, 2, 3, "белый", true);
        System.out.println(triangle.toString());
    }
}