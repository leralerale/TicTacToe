package ru.hse.edu.tictactoe;

import ru.hse.edu.tictactoe.view.MainWindow;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        EventQueue.invokeLater(() -> {
            MainWindow win = new MainWindow();


        });
    }
}