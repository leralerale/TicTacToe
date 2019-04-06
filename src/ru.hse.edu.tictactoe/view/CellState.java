package ru.hse.edu.tictactoe.view;

public enum CellState {


    White(0), Red(1), Green(2);

    private int state;

    CellState(int state){
        this.state = state;

    }

    public int getState(){ return state;}
}
