package firstTask;

public class Badger extends Dog{
    private String height;

    public Badger() {
    }

    public Badger(boolean tail, String voice, int paws, String eat, String height) {
        super(tail, voice, paws, eat);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "firstTask.Badger{" +
                "height='" + height + '\'' +
                "} " + super.toString();
    }
}

