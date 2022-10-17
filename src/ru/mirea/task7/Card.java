package ru.mirea.task7;

public class Card implements Comparable<Card> {
    private int number;
    public Card(int number){
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public int compareTo(Card o) {
        int result = 0;
        if (this.getNumber() == 9 && o.getNumber() == 0){
            result =  -1;
        }
        else if (this.getNumber() == 0 && o.getNumber() == 9){
            result = 1;
        }
        else if (this.getNumber() > o.getNumber()){
            result =  1;
        }
        else if (this.getNumber() < o.getNumber()){
            result = -1;
        }
        return result;
    }
}
