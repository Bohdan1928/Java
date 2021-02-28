package secondTask;

public class Paper {
    private String color;
    private String format;

    public Paper() {
    }

    public Paper(String color, String format) {
        this.color = color;
        this.format = format;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "color='" + color + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
