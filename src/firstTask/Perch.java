package firstTask;

public class Perch extends Fish{
    private String weight;

    public Perch() {

    }

    public Perch(boolean tail, String voice, int fins, String water, String weight) {
        super(tail, voice, fins, water);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "firstTask.Perch{" +
                "weight='" + weight + '\'' +
                "} " + super.toString();
    }
}
