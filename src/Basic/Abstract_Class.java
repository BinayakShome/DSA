package Basic;

abstract class Shape {
    abstract double getArea();

    void display() {
        System.out.println("Calculating area of the shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        System.out.println("Area of Circle: " + circle.getArea());

        System.out.println();

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

