package Task1.clothes;

import Task1.Clothes;
import Task1.Sizes;
import Task1.interfaces.WomenClothes;

public class Dress extends Clothes implements WomenClothes {
    public Dress() {
    }

    public Dress(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public Dress(int price, String color) {
        super(price, color);
    }

    @Override
    public void dressWomen() {

    }
}
