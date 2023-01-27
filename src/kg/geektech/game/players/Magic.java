package kg.geektech.game.players;

public class Magic extends Hero {
    private int increaseDamage;

    public Magic(int health, int damage, String name, int increaseDamage) {
        super(health, damage, SuperAbility.BOOST, name);
        this.increaseDamage = increaseDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + increaseDamage);

            }

        }

    }
}
