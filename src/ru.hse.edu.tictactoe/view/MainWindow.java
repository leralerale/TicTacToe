package ru.hse.edu.tictactoe.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.NORTH_EAST;


public class MainWindow extends JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int J = NORTH_EAST;
    int width = 800;//указываем размеры окна(не на весь экран)
    int height = 800;
    int xScr = screenSize.width / 2 - (width / 2);//центрируем окно
    int yScr = screenSize.height / 2 - (height / 2);


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
                System.out.println("ActionListener.actionPerformed : open");
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

        //Color myColor = new Color(255, 100, 100);

        //int f=3, v=3;




//        GridBagLayout gbag = new GridBagLayout();
//        GridBagConstraints gbc = new GridBagConstraints();
//        setLayout(new GridLayout(3,3));
//        JPanel binv0 = new JPanel();
//        JPanel binv1 = new JPanel();
//        JPanel jp3 = new Panel(3);
//        JPanel binv3 = new JPanel();
//        JPanel jp2 = new Panel(2);
//        JPanel binv4 = new JPanel();
//        JPanel jp1 = new Panel(1);
//        JPanel binv5 = new JPanel();
//        JPanel binv6 = new JPanel();

//        gbc.weightx = 1.0;
//        gbc.ipadx = 200;
//        gbc.ipady = 200;
//        gbc.gridwidth = 200;
//        gbag.setConstraints(binv0, gbc);
//        gbc.gridwidth = GridBagConstraints.RELATIVE;
//        gbag.setConstraints(binv1, gbc);
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        gbag.setConstraints(jp3, gbc);
//
//        gbc.weighty = 1.0;
//        gbc.gridwidth = 250;
//        gbag.setConstraints(binv3, gbc);
//        gbc.gridwidth = GridBagConstraints.RELATIVE;
//        gbag.setConstraints(jp2, gbc);
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        gbag.setConstraints(binv4, gbc);
//
//        gbc.weighty = 2.0;
//        gbc.gridwidth = 250;
//        gbag.setConstraints(jp1, gbc);
//        gbc.gridwidth = GridBagConstraints.RELATIVE;
//        gbag.setConstraints(binv5, gbc);
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        gbag.setConstraints(binv6, gbc);


        this.add(new Board(3,3));


//        this.add(jp3);
//
//        this.add(jp2);
//
//        this.add(jp1);


        setResizable(false);
    }
}


        //
        //


        /*JButton[][] panels=new JButton[f][v];
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                panels[i][j]=new JButton("Berton");
                panels[i][j].setPreferredSize(new Dimension(300, 300));
                jp1.add(panels[i][j]);
                if (i==2-j){
                    panels[i][j].setVisible(true);
                } else {panels[i][j].setVisible(false);}

            }}
        JPanel jp1 = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(myColor);

            }
        };
        int b = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton nb= new JButton(" Button " + b);
                nb.setPreferredSize(new Dimension(100, 100));
                jp1.add(nb);
                ++b;
            }
        }
        this.add(jp1, BorderLayout.CENTER);
        jp1.setSize(300, 300);
        jp1.setLayout(new GridLayout(3, 3));
        */




