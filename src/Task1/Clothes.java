package Task1;

public abstract class Clothes {
    private Sizes size;
    private int price;
    private String color;

    public Clothes() {
    }

    public Clothes(Sizes size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
