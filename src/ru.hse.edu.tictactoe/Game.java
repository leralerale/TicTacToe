package ru.hse.edu.tictactoe;

import ru.hse.edu.tictactoe.model.Model;
import ru.hse.edu.tictactoe.view.BoardListener;
import ru.hse.edu.tictactoe.view.CellPressedEvent;
import ru.hse.edu.tictactoe.view.MainWindow;

public class Game implements BoardListener {
    Model model;

    MainWindow win;

    int currentPlayer;

    public Game() {
        this.currentPlayer = 1;
        model = new Model();
        win = new MainWindow();
        this.win.setBoardListeners(this);
    }



    @Override
    public void cellPressed(CellPressedEvent e) {
        this.win.update(model.makeTurn(this.currentPlayer, e.getI(), e.getJ(), e.getK()));
        System.out.println(this.model.haswinner());
        nextPlayer();
    }

    private void nextPlayer(){
        if (currentPlayer==1) currentPlayer=2;
        else currentPlayer=1;
    }
}
