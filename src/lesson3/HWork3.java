package lesson3;

import java.util.Arrays;

public class HWork3 {


        public static void main(String[] args) {


            System.out.println(Arrays.toString(invertArray()));
            System.out.println("***************");

            System.out.println(Arrays.toString(fillArray()));
            System.out.println("***************");


            System.out.println(Arrays.toString(changeArray()));
            System.out.println("***************");

            fillDiagonal();
            System.out.println("***************");

            printArrayInConsole(7,4);
            System.out.println("***************");

//        6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;

            double[] myArray = {10, 3, 18, 67, 1};
            double max = myArray[0];
            double min = myArray[0];
            for (int i = 1; i < myArray.length; i++) {
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
            System.out.println("Максимальное значение в массиве myArray: " + max);
            System.out.println("Минимальное значение в массиве myArray: " + min);
        }

        //    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
//
        public static int[] invertArray() {
            int[] array = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
            for (int i = 0; i < array.length; i++) {
                array[i] = (array[i] == 0) ? 1 : 0;
            }
            return array;
        }

//      2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
//      1 2 3 4 5 6 7 8 … 100;

        public static int[] fillArray() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        public static int[] changeArray() {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] *= 2;
                }
            }
            return array;
        }
        //   4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        public static void fillDiagonal(){
            int[][] sqrArray = new int[4][4];
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    sqrArray[i][j] = (i == j || j == (4 - i - 1))? 1 : (int)(Math.random()*100);
                    System.out.printf("%4d", sqrArray[i][j]);
                }
                System.out.println();
            }
        }

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
//        типа int длиной len, каждая ячейка которого равна initialValue;

        public static int[] printArrayInConsole(int len, int initialValue){
            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
                System.out.printf("%s ", arr[i]);
            }
            System.out.println();

            return arr;
        }



    }


