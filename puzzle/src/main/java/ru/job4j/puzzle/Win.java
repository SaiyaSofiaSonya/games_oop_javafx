package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if(i == 0 || rsl != true ) {  rsl = checkRow(board, i); }
        }

       for (int i = 0; i < board.length; i++) {
             if(rsl == false )  rsl = checkColumn(board, i);
       }

        return rsl;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++)
            if(board[i][row] != 1) {
                rsl = false;
                break;
            }
            return rsl;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++)
            if(board[column][i] != 1) {
                rsl = false;
                break;
            }
        return rsl;
    }
    }


