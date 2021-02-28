package firstTask;

public class Fish extends Animals{
    private int fins;
    private String water;

    public Fish() {
    }

    public Fish(boolean tail, String voice, int fins, String water) {
        super(tail, voice);
        this.fins = fins;
        this.water = water;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "firstTask.Fish{" +
                "fins=" + fins +
                ", water='" + water + '\'' +
                "} " + super.toString();
    }
}
