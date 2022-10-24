package ru.mirea.lab2;


public class Human {
    Head headOfHuman;
    Hand leftHandOfHuman;
    Hand rightHandOfHuman;
    Leg leftLegOfHuman;
    Leg rightLegOfHuman;
    public Human(Head headOfHuman , Hand leftHandOfHuman , Hand rightHandOfHuman , Leg leftLegOfHuman , Leg rightLegOfHuman){
        this.headOfHuman = headOfHuman;
        this.rightHandOfHuman = rightHandOfHuman;
        this.leftHandOfHuman = leftHandOfHuman;
        this.rightLegOfHuman = rightLegOfHuman;
        this.leftLegOfHuman = leftLegOfHuman;
    }
    public String toString(){
        return "Вес головы: " + headOfHuman.getWeightOfHead() + " Радиус головы: " + headOfHuman.radius + " Вес " + leftLegOfHuman.getName() + " ноги: " + leftLegOfHuman.getWeightOfLeg() + " вес " + rightLegOfHuman.getName() + " ноги: " + rightLegOfHuman.getWeightOfLeg();
    }
}
