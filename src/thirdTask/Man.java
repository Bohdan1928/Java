package thirdTask;

public class Man implements ManClothes{
    private String tShirt;
    private String shorts;
    private String shoes;

    public Man() {

    }

    public Man(String tShirt, String shorts, String shoes) {
        this.tShirt = tShirt;
        this.shorts = shorts;
        this.shoes = shoes;
    }

    public String gettShirt() {
        return tShirt;
    }

    public void settShirt(String tShirt) {
        this.tShirt = tShirt;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public void toDressMan() {
        System.out.println("He dressed");
    }

    @Override
    public String toString() {
        return "Man{" +
                "tShirt='" + tShirt + '\'' +
                ", shorts='" + shorts + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }
}
