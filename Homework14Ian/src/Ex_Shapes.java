/**
 * 4. Create a Shape interface and several classes that implement it (e.g., Circle, Rectangle, Triangle):
 * <p>
 * Each class should have attributes like double area and double perimeter.
 * <p>
 * - Write a Comparator<Shape> to compare shapes by their area.
 * - Create a list of shapes with different areas and types.
 * <p>
 * - Use streams to:
 * -- Filter shapes with an area greater than a given value.
 * -- Find the smallest shape by area using a lambda or method reference.
 * -- Group shapes by their type (e.g., Circle, Rectangle, etc.).
 */

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_Shapes {
    public static void main(String[] args) {
        List<Shape> myShapeList = List.of(
                new Circle(5),
                new Circle(2),
                new Rectangle(4, 3),
                new Rectangle(10, 15),
                new Triangle(3, 4, 5),
                new Triangle(6, 7, 8)
        );

        List<Shape> areaGreaterThan20 = myShapeList.stream()
                .filter(shape -> shape.area() > 20)
                .toList();
        System.out.println("Shapes with area greater than 20: ");
        areaGreaterThan20.forEach(s -> System.out.println(s.getClass().getSimpleName() + " " + s.area()));
        System.out.println("-----------------------");

        Shape smallestShape = myShapeList.stream()
                .min(new ShapeComparator())
                .orElse(null);
        System.out.println("Smallest Shape: ");
        System.out.println(smallestShape.getClass().getSimpleName() + " " + smallestShape.area());
        System.out.println("------------------------");


        Map<Class<? extends Shape>, List<Shape>> groupedShapes = myShapeList.stream()
                .collect(Collectors.groupingBy(s -> s.getClass()));
        System.out.println("Grouped Shapes: ");

        groupedShapes.forEach((k,v) -> {
            System.out.println(k.getSimpleName() + ":");
            v.forEach(s -> System.out.println(" - area: "+s.area()));
        });
    }
}

class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.area(), o2.area());
    }
}

class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (2 * width) + (2 * height);
    }
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

interface Shape {
    public double area();

    public double perimeter();
}
