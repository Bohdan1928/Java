import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "BA"));
        users.add(new User(2, "LA"));
        users.add(new User(3, "NA"));
        users.add(new User(4, "KA"));
        users.add(new User(5, "SA"));
        users.add(new User(6, "DA"));

        System.out.println(users);
    }
}
