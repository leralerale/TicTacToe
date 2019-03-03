package ru.hse.edu.tictactoe;

import java.util.ArrayList;

public class Model {
    private int a[][][];

    Model(){
       this.a= new int[3][3][3];

    }

    public void setCell(int i, int j, int k, int c){
        this.a[i][j][k]=c;
    }

    public int getCell(int i, int j, int k){
        return this.a[i][j][k];
    }
}
