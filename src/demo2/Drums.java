package demo2;

public class Drums implements Instruments{
    private String name;
    private int diam;

    public Drums() {
    }

    public Drums(String name, int diam) {
        this.name = name;
        this.diam = diam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    @Override
    public String toString() {
        return "Drums{" +
                "name='" + name + '\'' +
                ", diam=" + diam +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Грає " + getName() + " діаметру " + getDiam());
    }
}
