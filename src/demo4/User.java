package demo4;

public class User {
    private String name;
    private Seasons birthArea;

    public User() {
    }

    public User(String name, Seasons birthArea) {
        this.name = name;
        this.birthArea = birthArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seasons getBirthArea() {
        return birthArea;
    }

    public void setBirthArea(Seasons birthArea) {
        this.birthArea = birthArea;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthArea=" + birthArea +
                '}';
    }
}
