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
            if (input == number && count!=0) {
                JOptionPane.showMessageDialog(null, "Вы угадали число!");
                System.exit(0);
            }
            else if (input != number && count!=0 && input < number) {
                count--;
                JOptionPane.showMessageDialog(null , "Вы не угадали число\n Загаданное число больше \n Осталось попыток: " +count);
            }
            else if (input != number && count!=0 && input > number) {
                count--;
                JOptionPane.showMessageDialog(null , "Вы не угадали число\n Загаданное число меньше \n Осталось попыток: " +count);
            }
            else if (count == 0){
                count = -1;
                JOptionPane.showMessageDialog(null , "Вы не угадали число \n Попыток больше нет");
            }
            else if(count == -1){
                JOptionPane.showMessageDialog(null , "Попыток больше нет");
                System.exit(0);
            }

        }
    }
}
