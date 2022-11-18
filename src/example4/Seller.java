package example4;

import java.util.List;

public interface Seller {
    List<Buyable> getBuyableItems();
    void onBuy(Buyable b, Unit buyer);
    void onSell(Sellable s, Unit seller);
}
