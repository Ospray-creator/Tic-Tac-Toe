package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static final char[][] board = new char[3][3];

    public static void printBoard() {
        Arrays.asList("---------",
                "| " + board[0][2] + " " + board[1][2] + " " + board[2][2] + " |",
                "| " + board[0][1] + " " + board[1][1] + " " + board[2][1] + " |",
                "| " + board[0][0] + " " + board[1][0] + " " + board[2][0] + " |",
                "---------").forEach(System.out::println);
    }

    public static void move(char player) {
        if (checkWin(board)) {
            System.exit(0);
        }
        if (checkDraw(board)) {
            System.out.println("Draw");
            System.exit(0);
        }
        System.out.printf("%s: ", player(board));

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(SCANNER.next()) - 1;
            b = Integer.parseInt(SCANNER.next()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            move(player(board));
        }


        if ((a >= 0 && a < 3) && (b >= 0 && b < 3)) {
            if (board[a][b] == 'O' || board[a][b] == 'X') {
                System.out.println("This cell is occupied! Choose another one!");
                move(player(board));
            } else {
                board[a][b] = player(board);
            }
        } else {
            System.out.println("Coordinates should be from 1 to 3!");
            move(player(board));
        }

        printBoard();
        move(player(board));
    }

    public static boolean checkWin(char[][] board) {
        char winner = ' ';


        //Проверка на победителя:
        {
            //Проверяем первую координату

            {
                if (board[0][2] == board[1][2] && board[0][2] == board[2][2]) {
                    winner = board[0][2];

                }

                if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                    winner = board[0][2];
                }

                if (board[0][2] == board[0][1] && board[0][1] == board[0][0]) {
                    winner = board[0][2];
                }
            }

            //Проверяем вторую координату

            if (board[1][2] == board[1][1] && board[1][1] == board[1][0]) {
                winner = board[1][2];
            }

            //Проверяем третюю координату
            {
                if (board[2][2] == board[2][1] && board[2][1] == board[2][0]) {
                    winner = board[2][2];

                }
                if (board[2][2] == board[1][1] && board[2][2] == board[0][0]) {
                    winner = board[2][2];
                }

            }

            //Проверяем четвертую координату
            if (board[0][1] == board[1][1] && board[0][1] == board[2][1]) {
                winner = board[0][1];
            }

            //Проверяем седьмую координату
            if (board[0][0] == board[1][0] && board[0][0] == board[2][0]) {
                winner = board[0][0];
            }
        }

        //Проверка если переменная winner изменилась

        if (winner == ' ') {
            return false;
        } else {
            System.out.printf("%s wins\n", winner);
            return true;
        }

    }

    public static boolean checkDraw(char[][] board) {
        boolean draw = false;
        if (!charSearch(' ', board)) {
            draw = true;
        }

        return draw;
    }

    public static boolean charSearch(char a, char[][] board) {
        boolean ch = false;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j <= 2; j++) {
                if (board[j][i] == a) {
                    ch = true;
                    break;
                }
            }

        }
        return ch;
    }

    public static char player(char[][] board) {
        int x = 0;
        int o = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    x++;
                }
                if (board[i][j] == 'O') {
                    o++;
                }
            }
        }
        if ((x + o) % 2 == 0) {
            return 'X';
        }
        return 'O';
    }

    public static void main(String[] args) {
        String cells = "         ";
        int k = 0;
        for (int i = 2; i >= 0; --i) {
            for (int j = 0; j < 3; ++j) {
                board[j][i] = cells.charAt(k);
                k++;
            }
        }

        printBoard();
        move(player(board));
    }
}