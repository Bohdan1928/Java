package secondTask;

public class Book extends Paper{
    private int pages;
    private boolean cover;
    private String name;
    private int price;

    public Book() {
    }

    public Book(String color, String format, int pages, boolean cover, String name, int price) {
        super(color, format);
        this.pages = pages;
        this.cover = cover;
        this.name = name;
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", cover=" + cover +
                ", name='" + name + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
