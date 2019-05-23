package ru.hse.edu.tictactoe.view;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width=500;//указываем размеры окна(не на весь экран)
    int height=500;
    int xScr = screenSize.width/2-(width/2);//центрируем окно
    int yScr = screenSize.height/2-(height/2);

    SimpleWindow(String text) {
        super("Info");
        setResizable(false);//делает активным/пассивным стандартную кнопку раскрытия окна на весь экран или его сворачивание
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(xScr, yScr,width,height);
        JLabel label = new JLabel(text, SwingConstants.LEFT);
        label.setPreferredSize(new Dimension(400, 400));
        getContentPane().add(label);


        //pack();/уменьшает окно, делая его соразмерным с текстом

    }

}
