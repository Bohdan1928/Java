package firstTask;

public class Salmon extends Fish{
    private String color;

    public Salmon() {
    }

    public Salmon(boolean tail, String voice, int fins, String water, String color) {
        super(tail, voice, fins, water);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "firstTask.Salmon{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
