package com.shapes.shapeshierarchy;


public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(){
        this.color = "white";
        this.filled = false;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public boolean isfilled(){
        return filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
        
    public abstract void resize(double factor);
    
    @Override
    public String toString(){
        return"Shape[Color=" + color + ", Filled" + filled + "J";
    }
}
