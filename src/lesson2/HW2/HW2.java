package lesson2.HW2;

public class HW2 {

    public static void main(String[] args) {

        if (within10and20(17,5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

            System.out.println("***************");

        isPositiveOrNegative(-5);
            System.out.println("***************");

        if (isNegative(8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
            System.out.println("***************");

        String word = "Привет, мир";
        printWordNTimes(word,5);
        System.out.println("***************");

        if (leapYear(1_982)) {
        System.out.println("true");
        } else System.out.println("false");

    }

//    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false.

        public static boolean within10and20(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

//    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

//    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
//        отрицательное, и вернуть false если положительное.

    public static boolean isNegative(int y) {
        return (y < 0);
        }

//    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
//    указанную строку, указанное количество раз;

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

//    5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
//            високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом
//        каждый 400-й – високосный.


        public static boolean leapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        }

}



