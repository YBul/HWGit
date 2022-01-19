package lesson2;

public class TwoClass {

    public static void main(String[] args) {
//        studySwitch();
//        run();
//        studyFor1();
//        printTable(10,10);

        int a = 0;

//        while (a < 10) {
//            a++;
//            if (a == 4 || a == 7) {
//                continue;
//            }
////            if (a == 8) {
////                break;
////            }
//            System.out.print(a + " | ");
//
//        }

            do {
                a++;
                System.out.print(a + " | ");
            } while (a < 10);
    }

    public static void studyFor1() {
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println("*****");

//    for (int i = 1; i <= 5; i++) {
//        System.out.println(i + 2);
//    }
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println(i + 2);
        }
    }

    public static void printTable(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }


//    public static void run() {
//
//        for (int i = 3; i <= 10; i++) {
//                System.out.println("I run now " + i + " circle");
//            }

        }



//        private static void studySwitch() {
//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Alex") {
//            System.out.println("Send letter to Alex");
//        } else if (nameLetter == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (nameLetter == "Olga") {
//            System.out.println("Send letter to Olga");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("******************************");
//
//        switch (nameLetter) {
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//
//    }

