package lesson6.models;

public abstract class Unit {

    protected int health;
    protected String name;
    protected int speed;

    public Unit(int health, String name, int speed) {
        this.health = health;
        this.name = name;
        this.speed = speed;
    }

    public Unit(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " says something");
    }

    public void run() {
        System.out.println(name + " run with speed " + speed + " m/s");
    }

    public void takeDamage(int damage) {
        if (health >= damage) {
            health -= damage;
            System.out.println(name + " take damage " + damage + " point. Health now is " + health);
        } else {
            System.out.println(name + " is dead");
        }
    }

    public abstract void jump();
}
