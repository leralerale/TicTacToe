package ru.hse.edu.tictactoe;

import ru.hse.edu.tictactoe.model.Model;
import ru.hse.edu.tictactoe.view.MainWindow;

public class Game {
    Model model;

    MainWindow win;

    Game() {
        model = new Model();
        win = new MainWindow();
    }


}
