package ru.hse.edu.tictactoe.view;

import java.util.EventObject;

public class CellPressedEvent extends EventObject {

    private int i;
    private int j;
    private int k;


    public CellPressedEvent(Object source, int i, int j, int k) {
        super(source);
        this.i = i;
        this.j = j;
        this.k = k;
    }
    public int getI(){return i-1;}
    public int getJ(){return j;}
    public int getK(){return k;}
}
