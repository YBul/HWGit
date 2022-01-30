package lesson4.MyHW4;

import java.util.Random;
import java.util.Scanner;

public class HW4f1 {
    public static final int field_size = 5;         // размер игрового поля
    public static final int cell_for_win = 4;        // сколько ячеек нужно подряд заполнить, чтобы победить

    public static final char empty = '_';            // заполнитель для пустой ячейки
    public static final char playerOne = 'X';    // символ, которым играет первый игрок
    public static final char playerTwo = 'O';    // символ, которым играет второй игрок

    public static Scanner input = new Scanner(System.in);
    public static char[][] gameField;               // игровое поле - в виде двумерного массива символов

    public static void createField() {
        gameField = new char[field_size][field_size];
        for (int i = 0; i < field_size; i++) {
            for (int j = 0; j < field_size; j++) {
                gameField[i][j] = empty;
            }
        }
    }

    public static void showField() {
        for (int i = 0; i <= gameField.length; i++) {    // распечатываем горизонтальную "шапку" - координата X
            System.out.print(i == 0 ? "  " : i + " ");   // не выводим 0 на печать
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + " ");            // распечатываем вертикальную "шапку" - координата Y
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkCellFree(int x, int y) {
        return x >= 0 && x < field_size && y >= 0 && y < field_size && gameField[y][x] == empty;    // если x и y находятся в допустимых пределах И если ячейка не равна пустой, то возвращаем true
    }

    public static void stepPlayerOne() {
        int x, y;
        do {
            System.out.println("Введите координаты хода через пробел в формате X Y");
            x = Integer.valueOf(input.next()) - 1;
            y = Integer.valueOf(input.next()) - 1;
        } while (!checkCellFree(x, y));
        gameField[y][x] = playerOne;
    }

    public static void stepPlayerTwo() {
        int x, y;
        do {
            x = new Random().nextInt(field_size);
            y = new Random().nextInt(field_size);
        } while (!checkCellFree(x, y));
        System.out.println("ИИ походил в ячейку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = playerTwo;
    }

    public static boolean isWin(char playerChar) {
        int hor, ver;
        int diagMain, diagReverse;
        for (int i = 0; i < field_size; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < field_size; j++) {
                if (gameField[i][j] == playerChar) {                          // проверяем горизонтальные линии на возможную победу
                    hor++;
                } else if (gameField[i][j] != playerChar && hor < cell_for_win) {
                    hor = 0;
                }
                if (gameField[j][i] == playerChar) {                          // проверяем вертикальные линии на возможную победу
                    ver++;
                } else if (gameField[j][i] != playerChar && ver < cell_for_win) {
                    ver = 0;
                }
            }
            if (hor >= cell_for_win || ver >= cell_for_win) {
                System.out.println("По горизонтали или вертикали " + hor + " " + ver);
                return true;
            }
        }

        for (int j = 0; j < field_size; j++) {
            diagMain = 0;
            for (int i = 0; i < field_size; i++) {
                int k = j + i;
                if (k < field_size) {
                    if (gameField[i][k] == playerChar) {                      // проверяем главную диагональ от центральной оси вправо на возможную победу
                        diagMain++;
                    } else if (gameField[i][k] != playerChar && diagMain < cell_for_win) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= cell_for_win) {
                    System.out.println("По главной диагонали от центральной оси вправо " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 1; j < field_size; j++) {
            diagMain = 0;
            for (int i = 0; i < field_size; i++) {
                int k = j + i;
                if (k < field_size) {
                    if (gameField[k][i] == playerChar) {                      // проверяем главную диагональ от центральной оси вниз на возможную победу
                        diagMain++;
                    } else if (gameField[k][i] != playerChar && diagMain < cell_for_win) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= cell_for_win) {
                    System.out.println("По главной диагонали от центральной оси вниз " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 0; j < field_size; j++) {
            diagReverse = 0;
            for (int i = 0; i < field_size; i++) {
                int k = (field_size - 1) - i;
                int l = j + i;
                if (k >= 0 && l < field_size) {
                    if (gameField[l][k] == playerChar) {                     // проверяем побочную диагональ от центральной оси вниз на возможную победу
                        diagReverse++;
                    } else if (gameField[l][k] != playerChar && diagReverse < cell_for_win) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= cell_for_win) {
                    System.out.println("По побочной диагонали от центральной оси вниз " + diagReverse);
                    return true;
                }
            }
        }
        for (int j = 1; j < field_size; j++) {
            diagReverse = 0;
            for (int i = 0; i < field_size; i++) {
                int k = (field_size - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerChar) {     // проверяем побочную диагональ от центральной оси влево на возможную победу
                        diagReverse++;
                    } else if (gameField[i][k] != playerChar && diagReverse < cell_for_win) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= cell_for_win) {
                    System.out.println("По побочной диагонали от центральной оси влево " + diagReverse);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw() {                            // метод проверяет вариант ничьей
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createField();
        System.out.println("Цель игры - заполнить подряд линию по вертикали, горизонтали или диагонали из 4 Ваших символов");
        showField();

        switch (new Random().nextInt(2)) {
            case 0: {
                System.out.println("Ваш ход первый!");
                while (true) {
                    stepPlayerOne();
                    showField();
                    if (isWin(playerOne)) {
                        System.out.println("Победил Игрок 1");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    stepPlayerTwo();
                    showField();
                    if (isWin(playerTwo)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                break;
            }
            case 1: {
                System.out.println("Первый ход за ИИ!");
                while (true) {
                    stepPlayerTwo();
                    showField();
                    if (isWin(playerTwo)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    stepPlayerOne();
                    showField();
                    if (isWin(playerOne)) {
                        System.out.println("Победил Игрок 1");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
            }
        }
    }
}


