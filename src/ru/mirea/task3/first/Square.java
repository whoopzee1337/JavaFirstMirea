package ru.mirea.task3.first;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.side = 1.00;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side , String color , boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Area " + this.side*2 + " Perimetr: " + this.side*4;
    }
}
