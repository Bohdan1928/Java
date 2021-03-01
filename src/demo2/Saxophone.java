package demo2;

public class Saxophone implements Instruments{
    private String name;
    private String type;

    public Saxophone() {
    }

    public Saxophone(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Saxophone{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Грає " + getName() + " типу " + getType());
    }
}
