package ru.hse.edu.tictactoe;

import ru.hse.edu.tictactoe.model.Model;
import ru.hse.edu.tictactoe.view.BoardListener;
import ru.hse.edu.tictactoe.view.CellPressedEvent;
import ru.hse.edu.tictactoe.view.MainWindow;

public class Game implements BoardListener {
    Model model;

    MainWindow win;

    Game() {
        model = new Model();
        win = new MainWindow();
        this.win.setBoardListeners(this);
    }


    @Override
    public void cellPressed(CellPressedEvent e) {
        
    }
}
