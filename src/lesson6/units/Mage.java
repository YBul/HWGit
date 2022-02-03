package lesson6.units;

import lesson6.models.Unit;

public class Mage extends Unit {


    private int intelligence;
    private int manaPoint;

    private int costCreateFire = 20;
    private int costCreateIce = 30;

    public Mage(int health, String name, int speed, int intelligence) {
        super(health, name, speed);
        this.intelligence = intelligence;
        this.manaPoint = intelligence * 10;
    }

    public void createFire() {
        if (manaPoint >= costCreateFire) {
            manaPoint -= costCreateFire;
            System.out.println(name + " has created fire. Current mana point = " + manaPoint);
        } else {
            System.out.println("Not enough mana point. Need " + (costCreateFire - manaPoint) + " point");
        }

    }

    public void createIce() {
        if (manaPoint >= costCreateIce) {
            manaPoint -= costCreateIce;
            System.out.println(name + " has created ice. Current mana point = " + manaPoint);
        } else {
            System.out.println("Not enough mana point. Need " + (costCreateIce - manaPoint) + " point");
        }
    }

    @Override
    public void jump() {
        System.out.println(name + " jump-jump-jump");
    }

}
