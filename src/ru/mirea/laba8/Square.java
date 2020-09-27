package ru.mirea.laba8;

public class Square extends Shape {
    private double side;
    private double width;
    private double length;
    public Square(double side,String color,boolean filled){
        super(color, filled);
        this.side=side;
    }
    public  double getSide(){return side;}
    public  void setSide(double side){this.side=side;}
    public void setWidth(double width){this.width=width;}
    private void setLength(double length){this.length=length;}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
