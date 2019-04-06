package ru.hse.edu.tictactoe;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MainWindow win = new MainWindow();
            win.setVisible(true);

        });


    }
}
