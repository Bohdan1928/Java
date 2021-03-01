package demo1;

public class User extends Human implements Runner{
    private String name;
    private int id;

    public User() {
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void run() {

    }

    @Override
    public void sing() {

    }

    @Override
    public String toString() {
        return "demo1.User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
