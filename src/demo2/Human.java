package demo2;

public abstract class Human {
    private int id;

    public Human() {
    }

    public Human(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void live();

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                '}';
    }
}
