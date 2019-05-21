package ru.hse.edu.tictactoe.model;

import java.util.Random;

public class Bot {

    public Bot (){
    }

    public Model makeTurn(Model model){
        int[][][] board = model.getBoard();
        int i, j, k;
        if (board[1][1][1] == 0) {
            board[1][1][1] = 2;
            return model;
        }
        else {
            for (i = 0; i < 3; i++)
                for (j = 0; j < 3; j++)
                    for (k = 0; k < 3; k++) {
                        if (model.getCell(i,j,k)==0) {
                            if (findsosedis(i, j, k, board, 2)) {
                                model.setCell(i, j, k, 2);
                                return model;
                            }
                            if (findsosedis(i, j, k, board, 1)) {
                                model.setCell(i, j, k, 2);
                                return model;
                            }
                        }
                    }
        }
        Random random = new Random();
        while (true){
            i = random.nextInt(3);
            j = random.nextInt(3);
            k = random.nextInt(3);

            if (model.getBoard()[i][j][k] == 0) {
                model.setCell(i,j,k,2);
                return model;
            }

        }
    }

    private boolean findsosedis(int i, int j, int k, int[][][] board, int f){
        int n=0;
        for (int x = -2; x < 3; x++) {
            if ((i+x) >= 0 && (i+x) < 3 && x != 0)
                if (board[i+x][j][k] == f)
                    n++;
                }
        if (n==2)
            return true;
        n=0;
        for (int y = -2; y < 3; y++) {
            if ((j+y) >= 0 && (j+y) < 3 && y != 0)
                if (board[i][j+y][k] == f)
                    n++;
        }
        if (n==2)
            return true;
        n=0;
        for (int z = -2; z < 3; z++) {
            if ((k+z) >= 0 && (k+z) < 3 && z != 0)
                if (board[i][j][k+z] == f)
                    n++;
        }
        if (n==2)
            return true;
        return false;
    }
}
