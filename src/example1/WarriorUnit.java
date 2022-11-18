package example1;

public class WarriorUnit extends Unit implements Warrior {
    private int attack;

    public WarriorUnit(int maxHP, int hp, int attack) {
        super(maxHP, hp);
        setAttack(attack);
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "example1.WarriorUnit{" +
                "attack=" + attack +
                "} " + super.toString();
    }
}
