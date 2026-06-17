package com.shapes.shapeshierarchy;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        if (radius <= 0) {
            throw new InvalidShapeException("Radius must be positive. Got: " + radius);
        }
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        if (radius <= 0) {
            throw new InvalidShapeException("Radius must be positive. Got: " + radius);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor must be positive. Got: " + factor);
            
        }
        radius = radius * factor;
    }

    @Override
    public String toString() {
        return "Circle[Radius=" + radius + ", Color=" + color + 
               ", Filled=" + filled + 
               ", Area=" + String.format("%.2f", getArea()) + 
               ", Perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}