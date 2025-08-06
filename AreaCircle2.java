package oops;

class Circle {
    // Method with parameter
    void calculateArea(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class AreaCircle2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        // Corrected method call to match the method name in Circle class
        c.calculateArea(2.5);  // Now calling calculateArea instead of Area
    }
}