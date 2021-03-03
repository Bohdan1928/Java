package Task1;

public enum Sizes {
    XSS(20),
    S(25),
    M(30),
    L(35);

    private int euroSize;

    Sizes() {

    }

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
