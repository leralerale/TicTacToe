package ru.hse.edu.tictactoe.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CellView extends JLabel {

    private final int k;

    private BoardListener listener;
    private CellPressedEvent event;

    private CellState state;
    private final int x;
    private final int y;

    private ImageIcon whiteIcon;
    private ImageIcon redIcon;
    private ImageIcon greenIcon;

    public CellView(CellState state, int x, int y, int k){
        this.state = state;
        this.x = x;
        this.y = y;
        whiteIcon = new ImageIcon(CellView.class.getResource("/white70px.png"));
        redIcon = new ImageIcon(CellView.class.getResource("/red70px.png"));
        greenIcon = new ImageIcon(CellView.class.getResource("/green70px.png"));
        this.setVisible(true);
        this.changeView();
        this.event = new CellPressedEvent(this, this.x, this.y, this.k);
        this.addMouseListener(new CellView.MouseClickListener());
    }

    private void changeView(){
        if (state == CellState.Green) this.setIcon(greenIcon);
        if (state == CellState.White) this.setIcon(whiteIcon);
        if (state == CellState.Red) this.setIcon(redIcon);
    }

    void setState(CellState cellState) {
        this.state = cellState;
        this.changeView();
    }

    void addCellPressedListener(BoardListener listener) {
        this.listener = listener;
    }

    private void fireCellPressed() {
        this.listener.cellPressed(this.event);
    }

    private class MouseClickListener extends MouseAdapter {
        private MouseClickListener() {
        }

        public void mouseClicked(MouseEvent e) {
            CellView.this.fireCellPressed();
        }
    }

}
