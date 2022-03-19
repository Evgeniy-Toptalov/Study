package FirstQuarter.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWLesson4 {
    //TicTacToe
    private static final int SIZE = 3;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '•';
    private static final char[][] MAP = new char[SIZE][SIZE];


    public static void main(String[] args) {
        initMap();
        printMap();


        while (true) {
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isDraw()) {
                break;
            }

            computerTurn();
            printMap();

            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isDraw()) {
                break;
            }
        }
    }

    private static boolean isDraw() {
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }

        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symbol) {
//        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true; // проверили строки
//        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true; // проверили строки
//        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true; // проверили строки

        for (int i = 0; i < SIZE; i++) {
            int summString = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    summString++;
                    if (summString == SIZE) {
                        return true;
                    }
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            int summColumn = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == symbol) {
                    summColumn++;
                    if (summColumn == SIZE) {
                        return true;
                    }
                }
            }
        }

        int summDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == symbol && (i == j || i + j == SIZE-1)) {
                    summDiagonal++;
                    if (summDiagonal == SIZE) {
                        return true;
                    }
                }
            }
        }
        return false;


//        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true; // проверили столбцы
//        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true; // проверили столбцы
//        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true; // проверили столбцы
//
//        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true; // проверили диагональ
//        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) return true; // проверили диагональ



    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false; // когда найдена пустая ячейка, значит можно ещё ходить.
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE); // SIZE не включительно
            y = random.nextInt(SIZE);
            System.out.println("Компьютер подобрал координаты " + x + " " + y);
        } while (MAP[x][y] != DOT_EMPTY);

        MAP[x][y] = DOT_O;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

