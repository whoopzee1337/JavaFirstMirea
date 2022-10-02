package ru.mirea.task1;
public class Dog{
    private String name;
    private int age;
    private String color;

    public Dog(String n, int a, String c){
        name = n;
        age = a;
        color = c;
    }
    public Dog(String n, String c){
        name = n;
        age = 0;
        color = c;
    }
    public Dog(){
        name = "Puppey";
        age = 0;
        color = "black";
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    private void setColor(String color){
        this.color=color;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(String color){
        return color;
    }
    public String toString(){
        return this.name+", age " + this.age+", color " + this.color;
    }
    public void getAvgWeightOfBody(){
        System.out.println(this.name + " Average weight of a dog of this age: "+age*1.33 + "kgs");
    }
}