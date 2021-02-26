import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String[] skills;
    private Wallet wallet;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User() {
    }

    public User(int id, String name, String[] skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public User(int id, String name, String[] skills, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
    }

    public User(int id, String name, String[] skills, String type, int sum) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = new Wallet(type, sum);

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                '}';
    }
}