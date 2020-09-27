package ru.mirea.laba8;

public class Circle extends Shape{
    private double radius;
    public  Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius() { return radius;}

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double area){
        return area;
    }
    public double getPerimetr(double perimetr){ return perimetr; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
