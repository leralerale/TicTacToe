package ru.hse.edu.tictactoe.controller;

import ru.hse.edu.tictactoe.view.CellPressedEvent;

import java.util.EventListener;

public interface BoardListener extends EventListener {
    void cellPressed(CellPressedEvent e);
}
