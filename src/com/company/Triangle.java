package com.company;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double p;
    private double area;
    public Triangle(){ }
    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double area(){
        p=(a+b+c)/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    @Override
    public String toString() {
        return "Треугольник(" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ") ";
    }
}
