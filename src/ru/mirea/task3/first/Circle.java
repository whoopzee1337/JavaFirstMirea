package ru.mirea.task3.first;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius= 1.00;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius , String color , boolean filled){
        this.radius =radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius , 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + " Perimetr: " + getPerimeter();
    }
}