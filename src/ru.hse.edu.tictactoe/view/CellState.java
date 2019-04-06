package ru.hse.edu.tictactoe.view;

public enum CellState {


    White,
    Red,
    Green;

    private int state;

    CellState(){
        this.state = ordinal();

    }

    public static CellState getStateByNumber(int num) throws IllegalArgumentException {
            try {
                return CellState.values()[num];
            } catch(ArrayIndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Unknown enum value :"+ num);
            }
    }
}
