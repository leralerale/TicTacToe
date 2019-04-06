package ru.hse.edu.tictactoe;

import java.util.EventListener;

public interface BoardListener extends EventListener {
    void cellPressed(CellPressedEvent e);
}
