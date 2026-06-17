package com.shapes.shapeshierarchy;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle( double width, double height){
        super();
        if(width <= 0 || height <= 0){
            throw new InvalidShapeException("Width and height must be positive. Got: " + width + ", " + height);            
        }
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        if (width <= 0 || height <= 0) {
            throw new InvalidShapeException("Width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return width * height;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * ( width + height);
    }
    
     @Override
    public void resize (double factor){
        if (factor <= 0){
            throw new InvalidShapeException("Resize factor must be positive. Got:" + factor);
        }
        width = width * factor;
        height = height * factor;
    }
    
    @Override
    public String toString() {
        return "Rectangle[Width=" + width + 
               ", Height=" + height + 
               ", Color=" + color  + 
               ", Filled=" + filled + "]";
    }
}
