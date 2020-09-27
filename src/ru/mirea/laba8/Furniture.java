package ru.mirea.laba8;

public abstract class Furniture {
    private String name;
    public String getName(){return name;}
    public Furniture(String name){
        this.name=name;
    }
    public abstract void display();
}