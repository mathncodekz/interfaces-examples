package example4;

import java.util.List;

public class UnitTrainBuilding extends Building implements Attackable, Seller {
    private int hp;
    private List<Buyable> creepsToSell;

    public int getHP() {
        return hp;
    }

    @Override
    public List<Buyable> getBuyableItems() {
        return creepsToSell;
    }

    @Override
    public void onBuy(Buyable b, Unit buyer) {
        //
    }

    @Override
    public void onSell(Sellable s, Unit seller) {
        //
    }
}
