package example1;

public class HeroUnit extends Unit implements Warrior, Mage {
    private int mana;
    private int maxMana;
    private int attack;

    public HeroUnit(int maxHP, int hp, int mana, int maxMana, int attack) {
        super(maxHP, hp);
        this.mana = mana;
        this.maxMana = maxMana;
        this.attack = attack;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int getMaxMana() {
        return maxMana;
    }

    @Override
    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "example1.HeroUnit{" +
                "mana=" + mana +
                ", maxMana=" + maxMana +
                ", attack=" + attack +
                "} " + super.toString();
    }
}
