package example1;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new WarriorUnit(100, 80, 8);
        Mage mage = new MageUnit(100, 80, 50, 10);
        HeroUnit hero = new HeroUnit(150, 120, 60, 40, 10);

        Monster m = new Monster();

        System.out.println(warrior);
        System.out.println("monster attacks warrior with fear!");
        m.fear(warrior);
        System.out.println(warrior);

        System.out.println(mage);
        System.out.println("monster attacks mage with manaburn!");
        m.manaBurn(mage);
        System.out.println(mage);

        System.out.println(hero);
        System.out.println("monster attacks hero with fear and manaburn!");
        m.fear(hero);
        m.manaBurn(hero);
        System.out.println(hero);



    }
}