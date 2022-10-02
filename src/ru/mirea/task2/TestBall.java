package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(3.2 , 5.4);
        Ball b2 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        b1.move(10.0 , 20.2);
        System.out.println(b1);
        b2.setX(10.0);
        System.out.println(b2);
        b2.setXY(15.0 , 15.0);
        System.out.println(b2);
    }
}
