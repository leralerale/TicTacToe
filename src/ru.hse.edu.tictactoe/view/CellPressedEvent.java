package ru.hse.edu.tictactoe.view;

import java.util.EventObject;

public class CellPressedEvent extends EventObject {

    private int x;
    private int y;
    private int k;
    public CellPressedEvent(Object source, int x, int y, int k) {
        super(source);
        this.x = x;
        this.y = y;
        this.k = k;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public int getK(){return k;}
}
