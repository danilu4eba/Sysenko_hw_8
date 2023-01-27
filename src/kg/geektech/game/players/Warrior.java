package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {
    private int CriticalDamage;

    public int getCriticalDamage() {
        return CriticalDamage;
    }

    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        Random random = new Random();
        int num = 2 + random.nextInt(5 - 2);
        CriticalDamage = getDamage() * num;
        if (this.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - CriticalDamage);

        }
    }

}

