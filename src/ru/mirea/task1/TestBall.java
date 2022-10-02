package ru.mirea.task1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(300, "red");
        Ball b2 = new Ball(400);
        Ball b3 = new Ball();
        b2.setWeight(300);
        System.out.println(b2);
        b1.calcMaxDistance();
        b2.calcMaxDistance();
        b3.calcMaxDistance();
    }
}
