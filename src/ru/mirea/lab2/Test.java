package ru.mirea.lab2;

public class Test {
    public static void main(String[] args) {
        Head headOfHuman = new Head(300 , 30);
        Hand leftHandOfHuman = new Hand(20 , "правой");
        Hand rightHandOfHuman = new Hand (20, "левой");
        Leg leftLegOfHuman = new Leg(80 , "левой");
        Leg rightLegOfHuman = new Leg(80 , "правой");
        Human man = new Human(headOfHuman , leftHandOfHuman , rightHandOfHuman, leftLegOfHuman , rightLegOfHuman);
        System.out.println(man);
    }
}
