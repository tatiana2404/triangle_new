package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle1=new Triangle(3,4,5);
        Triangle triangle2=new Triangle(5,7,9);
        Triangle triangle3=new Triangle(3,15,17);
        System.out.println(triangle1+"Площадь равна "+triangle1.area());
        System.out.println(triangle2+"Площадь равна "+triangle2.area());
        System.out.println(triangle3+"Площадь равна "+triangle3.area());
    }
}
