package example1;

public class Monster {
    void manaBurn(Mage mage) {
        mage.setMana(0);
    }

    void fear(Warrior warrior) {
        warrior.setAttack(0);
    }
}
