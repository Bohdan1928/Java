package secondTask;

public class Comics extends Book{
    private String comicsWorld;
    private int number;
    private String colorCover;

    public Comics() {
    }

    public Comics(String color, String format, int pages, boolean cover, String name, int price, String comicsWorld, int number, String colorCover) {
        super(color, format, pages, cover, name, price);
        this.comicsWorld = comicsWorld;
        this.number = number;
        this.colorCover = colorCover;
    }

    public String getComicsWorld() {
        return comicsWorld;
    }

    public void setComicsWorld(String comicsWorld) {
        this.comicsWorld = comicsWorld;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColorCover() {
        return colorCover;
    }

    public void setColorCover(String color) {
        this.colorCover = color;
    }
}
