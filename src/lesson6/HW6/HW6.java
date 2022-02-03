package lesson6.HW6;

import java.util.concurrent.Callable;

public class HW6 {

    public static void main(String[] args) {
        Cats cat1 = new Cats("Барсик", 7);
        Cats cat2 = new Cats("Васька", 8 );
        Dogs dog1 = new Dogs("Шарик", 10);
        Dogs dog2 = new Dogs("Зино", 12);

        cat1.run(250);
        cat2.run(200);
        dog1.run(300);
        dog2.run(350);
        System.out.println("********************");
        cat1.swim(10);
        cat2.swim(13);
        dog1.swim(10);
        dog2.swim(5);
        System.out.println("********************");
        System.out.println("Всего котов создано " + Cats.getCount());
        System.out.println("Всего собак создано " + Dogs.getCount());
        System.out.println("Всего животных создано " + Animals.getCount());

        }
    }



