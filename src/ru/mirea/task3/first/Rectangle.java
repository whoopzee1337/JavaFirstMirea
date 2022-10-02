package ru.mirea.task3.first;

public class Rectangle extends Shape{
    private double width;
    protected double length;

    public Rectangle(){
        this.width = 2.00;
        this.length = 2.00;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width , double length , String color , boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + " Perimetr " + getPerimeter();
    }
}
