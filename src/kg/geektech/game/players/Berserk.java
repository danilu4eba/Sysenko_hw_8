package kg.geektech.game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth()>0) {
            setBlockedDamage(boss.getDamage() / 5);
            setDamage(this.getDamage() + blockedDamage);
            setHealth(this.getHealth() + blockedDamage);
        }

    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
