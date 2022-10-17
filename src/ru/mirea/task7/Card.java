package ru.mirea.task7;

public class Card implements Comparable<Card> {
    private int number;
    public Card(int number){
        this.number = number;
    }
    @Override
    public int compareTo(Card o) {
        int result = 0;
        if (this.number == 9 && o.number == 0){
            result =  -1;
        }
        else if (this.number == 0 && o.number == 9){
            result = 1;
        }
        else if (this.number > o.number){
            result =  1;
        }
        else if (this.number < o.number){
            result = -1;
        }
        return result;
    }
    public String toString(){
        return "" + this.number;
    }
}
