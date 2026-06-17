package com.shapes.shapeshierarchy;

public class ShapesDemo {
    
    public static void printAreas(Shape[] shapes) {
        System.out.println("\n--- AREAS ---");
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + 
                             " area: " + String.format("%.2f", s.getArea()));
        }
    }
    
    public static Shape largest(Shape[] shapes) {
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > largest.getArea()) {
                largest = s;
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        
        // create shapes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "Red", true);
        shapes[1] = new Rectangle(4.0, 6.0, "Blue", false);
        shapes[2] = new Triangle(3, 4, 5, "Green", true);
        
        // print all shapes
        System.out.println("--- ALL SHAPES ---");
        for (Shape s : shapes) {
            System.out.println(s);
        }
        
        // print areas using polymorphism
        printAreas(shapes);
        
        // find largest shape
        System.out.println("\n--- LARGEST SHAPE ---");
        Shape big = largest(shapes);
        System.out.println(big);
        
        // resize a shape
        System.out.println("\n--- AFTER RESIZING CIRCLE BY FACTOR 2 ---");
        shapes[0].resize(2);
        System.out.println(shapes[0]);
        
        // demonstrate exception handling
        System.out.println("\n--- INVALID TRIANGLE TEST ---");
        try {
            Triangle invalid = new Triangle(1, 1, 100);
            System.out.println("This should not print!");
        } catch (InvalidShapeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}