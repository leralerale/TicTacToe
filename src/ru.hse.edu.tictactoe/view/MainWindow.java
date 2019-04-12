package ru.hse.edu.tictactoe.view;


import ru.hse.edu.tictactoe.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.NORTH_EAST;


public class MainWindow extends JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int J = NORTH_EAST;
    int width = 700;//указываем размеры окна(не на весь экран)
    int height =700;
    int xScr = screenSize.width / 2 - (width / 2);//центрируем окно
    int yScr = screenSize.height / 2 - (height / 2);
    Board board;


    public MainWindow() {
        super("TicTacToe");

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Game");
        menuBar.add(fileMenu);
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        JMenuItem newItem = new JMenuItem("New Game");
        fileMenu.add(newItem);

        this.setJMenuBar(menuBar);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Object[] options = { "Yes", "No" };

                int result = JOptionPane.showOptionDialog(null,"Do you really want start a new game?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);

                if (result == JOptionPane.YES_OPTION)
                {Game game = new Game();
                setVisible(false);}



            }
        });


        JMenu infoMenu = new JMenu("Info");
        menuBar.add(infoMenu);
        JMenuItem ruleItem = new JMenuItem("Rules");
        infoMenu.add(ruleItem);
        JMenuItem authorItem = new JMenuItem("About authors");
        infoMenu.add(authorItem);

        ruleItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JFrame myWindow1 = new SimpleWindow("Rules");
                myWindow1.setVisible(true);
            }
        });

        authorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JFrame myWindow2 = new SimpleWindow("<html>К этой метке применено HTML-форматирование, " +
                        "включая:  <font size = +1> увеличение размера </font>маркированный список </html>");

                myWindow2.setVisible(true);
            }
        });


        this.setBounds(xScr, yScr, width, height);
        this.setVisible(true);
        //this.setExtendedState(MAXIMIZED_BOTH);//окно на весь экран-не нужно использовать,но пусть пока будет
        this.setResizable(true);//делает активным стандартную кнопку раскрытия окна на весь экран или его сворачивание
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.board = new Board(3,3);
        this.add(this.board);



        setResizable(false);
    }


    public void update(int[][][] stateMatrix3D){
        this.board.update(stateMatrix3D);
    }
    public void setBoardListeners(BoardListener listener) {this.board.setListeners(listener);}
}






