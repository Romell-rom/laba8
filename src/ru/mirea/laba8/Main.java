package ru.mirea.laba8;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Sofa inter = new Sofa("jokk",3500,50,170);
        Stool inr = new Stool("jokkk",6000,30,120);
        Puff buk = new Puff("jokkkk",12000,20,140);
        Wardrobe guj = new Wardrobe("jokkkkk",18000,90,200);
        Table juk = new Table("jokkkkkk",9000,39,100);
    int t;
    Scanner mad=new Scanner(System.in);
    System.out.println("Выберите из списка представленной мебели  \n 1)Sofa \n 2)Stool \n 3)Puff \n 4)Wardrobe \n 5)Table");
    t = mad.nextInt();
    if (t==1){
        inter.display();
    }
    if (t==2){inr.display();}
    if (t==3){buk.display();}
    if (t==4){guj.display();}
    if (t==5){juk.display();}


    }

}