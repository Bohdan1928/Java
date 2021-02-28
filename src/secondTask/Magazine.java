package secondTask;

public class Magazine extends Book{
    private boolean pictures;
    private int number;

    public Magazine() {
    }

    public Magazine(String color, String format, int pages, boolean cover, String name, int price, boolean pictures, int number) {
        super(color, format, pages, cover, name, price);
        this.pictures = pictures;
        this.number = number;
    }

    public boolean isPictures() {
        return pictures;
    }

    public void setPictures(boolean pictures) {
        this.pictures = pictures;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "pictures=" + pictures +
                ", number=" + number +
                "} " + super.toString();
    }
}
