package Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Створити енум Стать.
        // Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
        // Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
        // Свторити  arrayList , та покласти цих юзерів в arayList.
        // - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
        //- Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
        //- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

        User user1 = new User(1, "Ma", 20, Sex.Man);
        User user2 = new User(2, "Na", 21, Sex.Man);
        User user3 = new User(3, "LaLaLa", 20, Sex.Man);
        User user4 = new User(4, "Ka", 21, Sex.Man);
        User user5 = new User(5, "Za", 20, Sex.Women);
        User user6 = new User(6, "Pa", 20, Sex.Women);
        User user7 = new User(7, "Fa", 20, Sex.Women);
        User user8 = new User(8, "Da", 20, Sex.Women);

        List<User> users = List.of(
                user1,
                user2,
                user3,
                user4,
                user5,
                user6,
                user7,
                user8
        );
        User.getUserId(users);
        System.out.println("|");
        System.out.println("|");
        User.getUserLengthName(users);
        System.out.println("|");
        System.out.println("|");
        User.getOnlyWomen(users);
    }
}
