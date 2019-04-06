package ru.hse.edu.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel implements Boardable
{
    private final int sizeX;
    private final int sizeY;

    private ArrayList<Panel> board = new ArrayList<>(3);

    private GridLayout layout;

    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        layout = new GridLayout(this.sizeX, this.sizeY);
        layout.setHgap(0);
        layout.setVgap(0);

        setLayout(this.layout);


        for (int x = 0; x < this.sizeX; x++){
            for (int y = 0; y < this.sizeY; y++){

                if (y == sizeY - x - 1) {
                    Panel p = new Panel(x+1);
                    this.add(p);
                    this.board.add(p);
                }
                else {
                    this.add(new Panel(0));
                }
            }
        }

    }
    public int getSizeX() {
        return this.sizeX;
    }
    public int getSizeY() {
        return this.sizeY;
    }



    public ArrayList<Panel> getBoard() {
        return this.board;
    }


    public void update(int[][][] stateMatrix3D){


    }

    /*@Override
    public ArrayList<ArrayList<CellState>> getBoard() {
        return this.board;
    }*/
}
