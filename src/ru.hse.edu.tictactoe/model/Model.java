package ru.hse.edu.tictactoe.model;

import java.util.ArrayList;

public class Model {
    private int a[][][];

    public Model() {
        this.a = new int[3][3][3];

    }

    public void setCell(int i, int j, int k, int c) {
        this.a[i][j][k] = c;
    }

    public int getCell(int i, int j, int k) {
        return this.a[i][j][k];
    }

    public int haswinner() {
        if (cheklines()!=0) return cheklines();
        if (chekmaindiag()!=0) return chekmaindiag();
        if (cheksidediag()!=0) return cheksidediag();
        if (chekcubediag()!=0) return chekcubediag();
        return 0;
    }

    private int cheklines() {
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                for (k = 0; k < 3; k++)
                    if ((a[0][j][k] == a[1][j][k]) && (a[1][j][k] == a[2][j][k]) && (a[0][j][k] == a[2][j][k])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                    else if ((a[i][0][k] == a[i][1][k]) && (a[i][1][k] == a[i][2][k]) && (a[i][0][k] == a[i][2][k])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                        else if ((a[i][j][0] == a[i][j][1]) && (a[i][j][1] == a[i][j][2]) && (a[i][j][0] == a[i][j][2])&&(a[i][j][k]!=0))
                            return a[i][j][k];
        return 0;
    }

    private int chekmaindiag() {
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                for (k = 0; k < 3; k++)
                    if ((a[i][0][0] == a[i][1][1]) && (a[i][1][1] == a[i][2][2]) && (a[i][0][0] == a[i][2][2])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                    else if ((a[0][0][k] == a[1][1][k]) && (a[1][1][k] == a[2][2][k]) && (a[0][0][k] == a[2][2][k])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                        else if ((a[0][j][0] == a[1][j][1]) && (a[1][j][1] == a[2][j][2]) && (a[0][j][0] == a[2][j][2])&&(a[i][j][k]!=0))
                            return a[i][j][k];
        return 0;
    }

    private int cheksidediag() {
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                for (k = 0; k < 3; k++)
                    if ((a[i][0][2] == a[i][1][1]) && (a[i][1][1] == a[i][2][0]) && (a[i][0][2] == a[i][2][0])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                    else if ((a[0][2][k] == a[1][1][k]) && (a[1][1][k] == a[0][2][k]) && (a[2][0][k] == a[0][2][k])&&(a[i][j][k]!=0))
                        return a[i][j][k];
                        else if ((a[0][j][2] == a[1][j][1]) && (a[1][j][1] == a[2][j][0]) && (a[2][j][0] == a[0][j][2])&&(a[i][j][k]!=0))
                            return a[i][j][k];
        return 0;
    }

    private int chekcubediag() {
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                for (k = 0; k < 3; k++)
                    if ((a[0][0][0] == a[1][1][1]) && (a[1][1][1] == a[2][2][2]) && (a[i][j][k]!=0))
                        return a[i][j][k];
                    else if ((a[0][2][2] == a[1][1][1]) && (a[1][1][1] == a[2][0][0]) && (a[i][j][k]!=0))
                        return a[i][j][k];
                        else if ((a[0][2][0] == a[1][1][1]) && (a[1][1][1] == a[2][0][2]) && (a[i][j][k]!=0))
                            return a[i][j][k];
                            else if ((a[0][0][2] == a[1][1][1]) && (a[1][1][1] == a[2][2][0]) && (a[i][j][k]!=0))
                                return a[i][j][k];
        return 0;
    }
}
