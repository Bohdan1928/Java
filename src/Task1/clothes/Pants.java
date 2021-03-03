package Task1.clothes;

import Task1.Clothes;
import Task1.Sizes;
import Task1.interfaces.ManClothes;
import Task1.interfaces.WomenClothes;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants() {
    }

    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public Pants(int price, String color) {
        super(price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
