package ru.mirea.laba8;
public class Stool extends Furniture {
    private double weight;
    private double height;
    private double price;
    public Stool (String name,double price,double weight,double height){
        super(name);
        this.price=price;
        this.height=height;
        this.weight=weight;
    }
    public void display(){
        System.out.printf("Sofa Name: %s \n it's is price: \n weight: %s \n height: %s \n", super.getName(),price, weight,height);

    };

}