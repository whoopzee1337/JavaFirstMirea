package ru.mirea.task2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball (double x , double y){
        this.x=x;
        this.y=y;
    }
    public Ball (){
        this.x = 1.0;
        this.y = 1.0;
    }

    public double getX() {
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x, double y ){
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp , double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public String toString(){
        return "Current ball's position x= " + this.x + " y= " + this.y;
    }

}
