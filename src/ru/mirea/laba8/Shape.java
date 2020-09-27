package ru.mirea.laba8;

public  abstract class Shape {
    private String color;
    private boolean filled;


    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;

    }
    public String getColor() { return color;}

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(double area){
        return area;
    }
    public double getPerimetr(double perimetr){ return perimetr; }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
