package ru.hse.edu.tictactoe.view;

import ru.hse.edu.tictactoe.controller.BoardListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {



    private GridLayout layout;

    private  ArrayList<ArrayList<CellView>> board = new ArrayList<ArrayList<CellView>>(3);;


    public Panel(int i) {
        super();
        //this.setPreferredSize(new Dimension(300, 300));
        setOpaque(true);
        layout = new GridLayout(3,3);
        layout.setHgap(2);
        layout.setVgap(2);
        setLayout(this.layout);
        setBackground(Color.BLACK);

        if (i !=0) {

            for (int j = 0; j < 3; j++) {
                board.add(new ArrayList<CellView>(3));
                for (int k = 0; k < 3; k++) {
                    this.board.get(j).add(k, new CellView(CellState.White, i, j, k));
                    this.add((Component)((ArrayList)this.board.get(j)).get(k));
                }
            }
        }

    }


    public void setListeners(BoardListener listener) {
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 3; ++k) {
                this.board.get(j).get(k).addCellPressedListener(listener);
            }
        }
    }



private void updatePanel(int[][] board) {
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 3; ++k) {
                this.board.get(j).get(k).setState(CellState.getStateByNumber(board[j][k]));
            }
        }

    }

    public ArrayList<ArrayList<CellView>> getBoard() {
        return board;
    }
    public void update (int[][] stateMatrix){
        this.updatePanel(stateMatrix);
        // получаем новую матрицу состояний и обновляем все ячейки
    }
}
