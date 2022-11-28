package ru.mirea.task10.second;

public class Main {
    public static void main(String[] args) {
        String chair1 = "Magic";
        Client first = new Client();
        Chair chair = first.sit(chair1);
        chair.getChair();
    }
}
