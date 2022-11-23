package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Animation extends JFrame {
    private Image img1 = new ImageIcon("png/mouse1.jpeg").getImage();
    private Image img2 = new ImageIcon("png/mouse2.jpeg").getImage();
    private Image img3 = new ImageIcon("png/mouse3.jpeg").getImage();
    private Timer timer;
    private int count;

    Animation(){
        super("Animation");
        setSize(153, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        count = 0;
        timer = new Timer();
        timer.schedule(animate , 1 , 200);

    }
    TimerTask animate = new TimerTask() {
        @Override
        public void run() {
            switch(count){
                case 0:
                    drawIcon(img1);
                    break;
                case 1:
                    drawIcon(img2);
                    break;
                case 2:
                    drawIcon(img3);
                    break;
                default:
                    break;
            }
            count++;
            if (count == 3){
                count = 0 ;
            }
        }
    };
    public void drawIcon(Image img){
        Graphics g = getGraphics();
        g.drawImage(img , 0, 20 , null);
    }
}

