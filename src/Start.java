import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        User user = new User();
        user.setId(100);
        System.out.println(user);
        int userId = user.getId();
        System.out.println(userId);
        String[] skills = new String[2];
        skills[0] = "java";
        skills[1] = "js";
        System.out.println(Arrays.toString(skills));
        User user1 = new User(2, "kokos", skills);
        System.out.println(user1);

        Wallet wallet = new Wallet("qw", 100000);
        Wallet wallet2 = new Wallet("ew", 2000);
        User userWithWallet = new User(3, "max", skills, wallet);
        System.out.println(userWithWallet);
    }
}