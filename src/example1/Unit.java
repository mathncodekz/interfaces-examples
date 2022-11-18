package example1;

public abstract class Unit {
    private int maxHP;
    private int hp;

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Unit(int maxHP, int hp) {
        this.maxHP = maxHP;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "example1.Unit{" +
                "maxHP=" + maxHP +
                ", hp=" + hp +
                '}';
    }
}
