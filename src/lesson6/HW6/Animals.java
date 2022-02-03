package lesson6.HW6;

public class Animals {

    protected String name;
    protected int speed;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    private static int count;

    public Animals(String name, int speed) {

        this.name = name;
        this.speed = speed;
    }
    

    public static int getCount() {
        return Cats.getCount() + Dogs.getCount();
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(type + " " + name + " пробежал " + dist + " m. " + " со скоростью " + speed + " m/сек");
        else System.out.println(type + " " + name + " не может бежать так далеко.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(type + " " + name + " проплыл " + dist + " m. " + " со скоростью " + speed + " m/cек");
        else System.out.println(type + " " + name + " не может плыть так далеко.");
    }



}
