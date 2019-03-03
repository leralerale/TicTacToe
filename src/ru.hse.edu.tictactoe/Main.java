package ru.hse.edu.tictactoe;

public class Main {

    public static void main(String[] args) {
        int i, j, k;
        Model b = new Model();
        b.setCell(1,1,1,2);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++){
                    System.out.print(b.getCell(i,j,k) + " "); }
                System.out.println();
            }
            System.out.println();
        }
    }
}