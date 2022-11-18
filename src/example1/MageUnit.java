package example1;

public class MageUnit extends Unit implements Mage {
    private int mana;
    private int maxMana;

    public MageUnit(int maxHP, int hp, int maxMana, int mana) {
        super(maxHP, hp);
        setMaxMana(maxMana);
        setMana(mana);
    }

    @Override
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    @Override
    public String toString() {
        return "example1.MageUnit{" +
                "mana=" + mana +
                ", maxMana=" + maxMana +
                "} " + super.toString();
    }
}
