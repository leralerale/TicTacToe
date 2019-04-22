package ru.hse.edu.tictactoe.controller;

import ru.hse.edu.tictactoe.model.Model;
import ru.hse.edu.tictactoe.view.CellPressedEvent;
import ru.hse.edu.tictactoe.view.MainWindow;

import javax.swing.*;

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
        //totoro
        if (this.model.getCell(e.getI(), e.getJ(), e.getK())==0){
        this.win.update(model.makeTurn(this.currentPlayer, e.getI(), e.getJ(), e.getK()));
        System.out.println(this.model.haswinner());
        nextPlayer();
        if ((this.model.haswinner()==1)||(this.model.haswinner()==2)) {
            Object[] options = {"Yes", "No"};

            int result = JOptionPane.showOptionDialog(null, this.model.haswinner() + " player win!" + "\n" + "Do you want start a new game?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            if (result == JOptionPane.YES_OPTION) {
                Game game = new Game();
                win.setVisible(false);
            } else System.exit(0);
        }
        }
    }

    private void nextPlayer(){
        if (currentPlayer==1) currentPlayer=2;
        else currentPlayer=1;
    }
}
