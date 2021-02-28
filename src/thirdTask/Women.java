package thirdTask;

public class Women implements WomenClothes{
    private String dress;
    private String shoes;

    public Women() {
    }

    public Women(String dress, String shoes) {
        this.dress = dress;
        this.shoes = shoes;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public void toDressWomen() {
        System.out.println("She dressed");
    }

    @Override
    public String toString() {
        return "Women{" +
                "dress='" + dress + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }
}
