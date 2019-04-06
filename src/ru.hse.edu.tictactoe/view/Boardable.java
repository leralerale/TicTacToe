package ru.hse.edu.tictactoe.view;

import java.util.ArrayList;

public interface Boardable {
    int getSizeX();  int getSizeY();
    ArrayList<Panel> getBoard();
}
