package ru.mirea.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class Game extends JFrame {
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 x 0" , SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A" , SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: Draw" , SwingConstants.CENTER);
    Font fnt = new Font("Times new roman" , Font.BOLD, 16);
    int firstTeamScore = 0;
    int secondTeamScore = 0;
    public Game() {
        super("AC Milan vs Real Madrid");
        setSize(400, 400);
        setLayout(new BorderLayout());

        add(but1 , BorderLayout.WEST);
        but1.setForeground(Color.RED);
        add(but2 , BorderLayout.EAST);
        but2.setForeground(Color.BLUE);
        add(result , BorderLayout.NORTH);
        result.setFont(fnt);
        add(lastScorer , BorderLayout.SOUTH);
        lastScorer.setFont(fnt);
        add(winner , BorderLayout.CENTER);
        winner.setFont(fnt);

        but1.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {}
            public void mouseClicked(MouseEvent a) {
                lastScorer.setText("Last Scorer: AC Milan");
                firstTeamScore++;
                result.setText("Result: " + firstTeamScore + " x " + secondTeamScore);
                if (firstTeamScore > secondTeamScore){
                    winner.setText("<- Winner: AC Milan");
                }
                else if (firstTeamScore == secondTeamScore){
                    winner.setText("Winner: draw");
                }
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        but2.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {}
            public void mouseClicked(MouseEvent a) {
                lastScorer.setText("Last Scorer: Real Madrid");
                secondTeamScore++;
                result.setText("Result: " + firstTeamScore + " x " + secondTeamScore);
                if (firstTeamScore < secondTeamScore){
                    winner.setText("Winner: Real Madrid ->");
                }
                else if (firstTeamScore == secondTeamScore){
                    winner.setText("Winner: draw");
                }
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });




    }
    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}