package com.shapes.shapeshierarchy;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super();
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidShapeException("All sides must be positive.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidShapeException("Invalid triangle sides: " + a + ", " + b + ", " + c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidShapeException("All sides must be positive.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidShapeException("Invalid triangle sides: " + a + ", " + b + ", " + c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor must be positive.");
        }
        a = a * factor;
        b = b * factor;
        c = c * factor;
    }

    @Override
    public String toString() {
        return "Triangle[A=" + a + 
               ", B=" + b + 
               ", C=" + c + 
               ", Color=" + color + 
               ", Filled=" + filled + "]";
    }
}