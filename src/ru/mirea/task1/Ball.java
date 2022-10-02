package ru.mirea.task1;

public class Ball {
    private int weight;
    private String color;

    public Ball(int w, String c){
        weight = w;
        color = c;
    }
    public Ball(int w){
        weight = w;
        color = "white";
    }
    public Ball(){
        weight=200;
        color="blackAndWhite";
    }

    public void setColor(String c){
        this.color=c;
    }
    public void setWeight(int w){
        this.weight=w;
    }
    public String getColor(String color){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        return "Weight of " +this.color+" ball is " + this.weight;
    }
    public void calcMaxDistance(){
        System.out.println("The max range this " + this.color +" ball can be punched is " + 50000/this.weight + " meters");
    }
}
