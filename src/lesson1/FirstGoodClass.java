package Lesson01.online;

import java.rmi.AlreadyBoundException;

public class FirstGoodClass {

    public static void main(String[] args) {
// //*...    //целые числа
//        byte myByte = 13;
//        short myShort = 130;
//        int myInteger = 50000;
//        long myLong = 5000000000L;
//
//        //числа с точкой
//        double myDouble = 13.13;
//        float myFloat = 13.13f;
//
//        //символы
//        char myChar = '@';
//
//        //строки
//        String myString = "myString123";
//
//        //логика
//        boolean myBooleanTrue = true;
//        boolean myBooleanFalse = false;
//
//        System.out.println(myByte);
//        System.out.println(myBooleanTrue);
//
//        //конкатенация
//        System.out.println(myFloat + myString);
//        System.out.println(myByte +  myString + myShort);
//
//        //математические операции


//        if (abc > 15) {
//            System.out.println("abc > 15! All good");
//        } else {
//            System.out.println("All bad");
//
//        }

//       int abc = 17;
//        if (abc > 15) {
//            System.out.println("abc > 15! All good");
//        } else if (abc == 17) {
//            System.out.println("<>");
//        } else {
//            System.out.println("All bad");
//
//        }
//        goToShop1();
//        System.out.println("****");
//        goToShop2("bread", 100);
//        System.out.println("****");
//        goToShop2("milk", 500);
//        System.out.println("****");
//        goToShop2("potato", 1000);

//    int myHomeCubishkaCash = goToShop3();
//        System.out.println(myHomeCubishkaCash);
    greetingsUser("Good day", "Alex");
    greetingsUser("Good night", "Boris");

}
//    public static void goToShop1() {
//            System.out.println("Go out home");
//            System.out.println("Go to shop");
//            System.out.println("Choose any goods");
//            System.out.println("Buy this goods");
//            System.out.println("Go to apteka");
//            System.out.println("Go to home");
//        }
//
//        public static void goToShop2(String goods, int cash) {
//        System.out.println("Get cash " + cash);
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose any " + goods);
//        System.out.println("Buy this goods");
//        System.out.println("Go to apteka");
//        System.out.println("Go to home");
//    }
//
//         public static int goToShop3() {
//             int cash = 1000;
//             System.out.println("Go out home");
//             System.out.println("Go to shop");
//             System.out.println("Choose any goods");
//             System.out.println("Buy this goods");
//             cash = cash - 150;
//             System.out.println("Go to home");
//             return cash;
//         }

         public static void greetingsUser(String time, String userName) {
             System.out.println(time + " user, " + userName);
         }

         }







