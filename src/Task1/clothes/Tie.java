package Task1.clothes;

import Task1.Clothes;
import Task1.Sizes;
import Task1.interfaces.ManClothes;

public class Tie extends Clothes implements ManClothes {
    public Tie() {
    }

    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public Tie(int price, String color) {
        super(price, color);
    }

    @Override
    public void dressMan() {

    }
}
