package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame extends JFrame {
    JTextField field;
    private JButton buttonApply = new JButton("Ввести");
    int count = 3;
    int input , number = 10;
    public GuessGame(){
        super ("Guess Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
        setSize(300 , 300);
        setResizable(true);
        setVisible(true);
        field =new JTextField(2);
        field.setToolTipText("Введите число");
        buttonApply.addActionListener(new ButtonEventListener());
        content.add(field);
        content.add(buttonApply);
        setContentPane(content);
    }
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(field.getText());
            System.out.println(input);
            if (input == number && count!=0) {
                JOptionPane.showMessageDialog(null, "Вы угадали число!");
            }
            else if (input != number && count!=0) {
                count--;
                JOptionPane.showMessageDialog(null , "Вы не угадали число \n Осталось попыток: " +count);
            }
            else if (count == 0){
                count = -1;
                JOptionPane.showMessageDialog(null , "Вы не угадали число \n Попыток больше нет");
            }
            else if(count == -1){
                JOptionPane.showMessageDialog(null , "Попыток больше нет");
            }

        }
    }
}
