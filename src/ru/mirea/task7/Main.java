package ru.mirea.task7;
import java.util.Scanner;
import java.util.Stack;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Card> deck1 = new Stack<>();
        Stack<Card> deck2 = new Stack<>();
        Stack<Card> board = new Stack<>();
        for (int i = 0 ; i < 5 ; i++){
            deck1.push(new Card(in.nextInt()));
        }
        for (int z = 0 ; z < 5 ; z++){
            deck2.push(new Card(in.nextInt()));
        }
        reverse(deck1);
        reverse(deck2);
        Card card1, card2;
        int rounds = 0;
        System.out.println(deck1 + " Первая");
        System.out.println(deck2 + " Вторая");
        while (!deck1.empty() && !deck2.empty() && rounds!=106){
            rounds++;
            card1 = deck1.pop();
            card2 = deck2.pop();
            board.push(card2);
            board.push(card1);
            System.out.println(card1 + " " + card2);
            if (card1.compareTo(card2) == 1){
                reverse(deck1);
                while(!deck1.empty()){
                    board.push(deck1.pop());
                }
                deck1.addAll(board);
            }
            if (card1.compareTo(card2) == -1){
                reverse(deck2);
                while(!deck2.empty()){
                    board.push(deck2.pop());
                }
                deck2.addAll(board);
            }
            board.clear();
            System.out.println(deck1 + " Первая");
            System.out.println(deck2 + " Вторая");
        }
        if (rounds == 106){
            System.out.println("botva");
            System.exit(0);
        }
        if (deck1.empty()){
            System.out.println("second " + rounds);
            System.exit(0);
        }
        else{
            System.out.println("first " + rounds);
            System.exit(0);
        }
    }
}
