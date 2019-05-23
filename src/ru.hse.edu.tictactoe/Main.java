package ru.hse.edu.tictactoe;

import ru.hse.edu.tictactoe.controller.Game;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Game game = new Game();
        });
    }
}