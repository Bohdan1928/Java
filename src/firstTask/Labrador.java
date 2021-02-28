package firstTask;

public class Labrador extends Dog{
    private String color;

    public Labrador() {
    }

    public Labrador(boolean tail, String voice, int paws, String eat, String color) {
        super(tail, voice, paws, eat);
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
        return "firstTask.Labrador{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
