package com.xoe;

import javax.swing.*;
import java.awt.*;

public class ResultGUI extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.GRAY);

        Dice dice = new Dice(6);
        int resultInt = dice.roll();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(resultInt);
        String result = sb.toString();
        g.drawString("The dice rolled a", 150, 125);
        g.drawString(result, 243, 125);
    }
}
