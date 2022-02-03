package lesson6.HW6;

public class Cats extends Animals {
    private static int count;

    public Cats(String name, int speed) {
        super(name, speed);
        this.type = "Кот";
        this.maxRun = 200;
        count++;

    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat's no swim!");
    }

}
