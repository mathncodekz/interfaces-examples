package example4;

public class WarriorCreep extends Creep implements Attackable, Attacker {
    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public void attack(Attackable attackable) {

    }

    @Override
    public int getBuyPrice() {
        return 0;
    }

    @Override
    public void move(Position p) {

    }
}
