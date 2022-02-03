package lesson6.HW6;

public class Dogs extends Animals {

    private static int count;

    public Dogs(String name, int speed) {
        super(name, speed);
        this.type = "Собака";
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public static int getCount() {
        return count;
    }




}
