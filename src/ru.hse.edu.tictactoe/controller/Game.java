package ru.hse.edu.tictactoe.controller;

import ru.hse.edu.tictactoe.model.Bot;
import ru.hse.edu.tictactoe.model.Model;
import ru.hse.edu.tictactoe.view.CellPressedEvent;
import ru.hse.edu.tictactoe.view.MainWindow;

import javax.swing.*;

public class Game implements BoardListener {
    Model model;

    MainWindow win;

    int currentPlayer;

    Bot bot = new Bot();
    int mode;

    static int PVP = 1;
    static int PVE = 2;

    public Game() {
        currentPlayer = 1;
        model = new Model();
        win = new MainWindow();
        win.setBoardListeners(this);
        Object[] options = {"Player vs Player", "Player vs Computer"};

        int result = JOptionPane.showOptionDialog(null,  "Select game type." +
                        "" + "\n" + "Have a good time!", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (result == JOptionPane.YES_OPTION) {
            mode=Game.PVP;
        } else
            mode = Game.PVE;
    }

    private void newGame(){
        currentPlayer = 1;
        model = new Model();
        Object[] options = {"Player vs Player", "Player vs Computer"};

        int result = JOptionPane.showOptionDialog(null,  "Select game type." + "\n" + "Have a good time!", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (result == JOptionPane.YES_OPTION) {
            mode=Game.PVP;
        } else
            mode = Game.PVE;
        win.update(model.getBoard());
    }

    @Override
    public void cellPressed(CellPressedEvent e) {
        //totoro
        if (this.model.getCell(e.getI(), e.getJ(), e.getK())==0){
            this.win.update(model.makeTurn(this.currentPlayer, e.getI(), e.getJ(), e.getK()));
            checkwinner();
            nextPlayer();
            checkwinner();
        }
    }

    private void checkwinner(){
        System.out.println(this.model.haswinner());
        if ((this.model.haswinner()==1)||(this.model.haswinner()==2)) {
            Object[] options = {"Yes", "No"};

            int result = JOptionPane.showOptionDialog(null, this.model.haswinner() + " player win!" + "\n" + "Do you want start a new game?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            if (result == JOptionPane.YES_OPTION) {
                newGame();
            } else System.exit(0);
        }
    }

    private void nextPlayer(){
        if (mode == 1) {
            if (currentPlayer==1) currentPlayer=2;
            else currentPlayer=1;
        }
        else {
            if (currentPlayer==1) {
                currentPlayer=2;
                this.model = bot.makeTurn(model);
                this.win.update(this.model.getBoard());
                nextPlayer();
            }
            else currentPlayer=1;

        }
    }
}