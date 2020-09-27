package ru.mirea.laba8;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public  Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.length=length;
        this.width = width;
    }
    public  double getWidth(){return  width;}
    public void setWidth(double width){this.width=width;}
    public  double getLength() {return length;}
    public  void setLength(double length){this.length=length;}
    public double getArea(double area){
        return area;
    }
    public double getPerimetr(double perimetr){ return perimetr; }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
