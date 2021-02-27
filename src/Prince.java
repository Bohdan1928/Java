public class Prince extends Human {
    private int finedShoes;

    public Prince() {
    }

    public Prince(String name, int age) {
        super(name, age);
    }

    public Prince(String name, int age, int finedShoes) {
        super(name, age);
        this.finedShoes = finedShoes;
    }

    public int getFinedShoes() {
        return finedShoes;
    }

    public void setFinedShoes(int finedShoes) {
        this.finedShoes = finedShoes;
    }

    public Princess find(Princess[] princesses){
        for (Princess princess : princesses) {
            if (princess.getSize() == this.finedShoes) {
                return princess;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "finedShoes=" + finedShoes +
                "} " + super.toString();
    }
}