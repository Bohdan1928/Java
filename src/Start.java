import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        //1. Створити 10 цілочисленних змінних
        //  - додати їх між собою
        //  - відняти їх між собою
        //  - перемножити їх між собою
        //  - поділити їх між собою
        //  Вивести результати в консоль

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int[] arr = new int[10];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        arr[3] = num4;
        arr[4] = num5;
        arr[5] = num6;
        arr[6] = num7;
        arr[7] = num8;
        arr[8] = num9;
        arr[9] = num10;

        // - додати їх між собою
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);

        // - відняти їх між собою
        int dif = 2;
        for (int i = 0; i < arr.length; i++) {
            dif -= arr[i];
        }
        System.out.println(dif);

        //  - перемножити їх між собою
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println(prod);

        //  - поділити їх між собою
        double frac = 1;
        for (int i = 0; i < arr.length; i++) {
            frac /= arr[i];
        }
        System.out.println(frac);

        // 2.Придумати речення з 10-12 слів. Кожне слово покласти в змінну.
        // Вивести в консоль ціле речення.
        // Мне лично тоже, все спокоцно домой пришли, дела поделали и за учебу

        String word1 = "Мне ";
        String word2 = "лично ";
        String word3 = "тоже, ";
        String word4 = "все ";
        String word5 = "спокоцно ";
        String word6 = "домой ";
        String word7 = "пришли, ";
        String word8 = "дела ";
        String word9 = "поделали ";
        String word10 = "и ";
        String word11 = "за ";
        String word12 = "учебу ";

        String[] words = new String[12];
        words[0] = word1;
        words[1] = word2;
        words[2] = word3;
        words[3] = word4;
        words[4] = word5;
        words[5] = word6;
        words[6] = word7;
        words[7] = word8;
        words[8] = word9;
        words[9] = word10;
        words[10] = word11;
        words[11] = word12;

        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i];
        }
        System.out.println(sentence);


        //3.Свторити клас User з полями
        //int id,
        //int age
        //String name,
        //String surname,
        //double weight,
        //double height.
        //Створити 10 об'єктів класу User.
        //Скласти між собою значення їх віку і вивести в консоль.
        //Скласти між собою значення їх ваги і вивести в консоль.
        //Скласти між собою значення їх зросту і вивести в консоль

        User user1 = new User(1, 20, "Name", "Surname", 68.1, 1.72);
        User user2 = new User(2, 19, "Name", "Surname", 67.9, 1.71);
        User user3 = new User(3, 30, "Name", "Surname", 68.1, 1.84);
        User user4 = new User(4, 20, "Name", "Surname", 66.2, 1.80);
        User user5 = new User(5, 23, "Name", "Surname", 68.1, 1.79);
        User user6 = new User(6, 22, "Name", "Surname", 70.3, 1.73);
        User user7 = new User(7, 20, "Name", "Surname", 68.1, 1.77);
        User user8 = new User(8, 17, "Name", "Surname", 69.8, 1.76);
        User user9 = new User(9, 26, "Name", "Surname", 63.2, 1.73);
        User user10 = new User(10, 21, "Name", "Surname", 68.1, 1.70);

        int totalAge = 0;
        float totalWeight = 0;
        float totalHeight = 0;
        List<User> users1 = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
        for (User user : users1) {
            totalAge += user.getAge();
            totalWeight += user.getWeight();
            totalHeight += user.getHeight();
        }
        System.out.println("total age is " + totalAge + ", " + "total weight is " + totalWeight + ", " + "total height is " + totalHeight);

//        users.forEach(user-> {
//
//        });


        //4. Зробити завдання 3, але 10 об'єктів покласти водин масив.
        //Скласти між собою значення їх віку і вивести в консоль.
        //Скласти між собою значення їх ваги і вивести в консоль.
        //Скласти між собою значення їх зросту і вивести в консоль.

        User user11 = new User(1, 20, "Name", "Surname", 68.1, 1.72);
        User user12 = new User(2, 19, "Name", "Surname", 67.9, 1.71);
        User user13 = new User(3, 30, "Name", "Surname", 68.1, 1.84);
        User user14 = new User(4, 20, "Name", "Surname", 66.2, 1.80);
        User user15 = new User(5, 23, "Name", "Surname", 68.1, 1.79);
        User user16 = new User(6, 22, "Name", "Surname", 70.3, 1.73);
        User user17 = new User(7, 20, "Name", "Surname", 68.1, 1.77);
        User user18 = new User(8, 30, "Name", "Surname", 67.8, 1.76);
        User user19 = new User(9, 29, "Name", "Surname", 63.2, 1.73);
        User user20 = new User(10, 21, "Name", "Surname", 61.1, 1.78);

        User[] users4 = {
                user11,
                user12,
                user13,
                user14,
                user15,
                user16,
                user17,
                user18,
                user19,
                user20

        };
        int totalAge1 = 0;
        float totalWeight1 = 0;
        float totalHeight1 = 0;

        for (User user : users4) {
            totalAge1 += user.getAge();
            totalHeight1 += user.getHeight();
            totalWeight1 += user.getWeight();


        }
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("total age is " + totalAge1 + ", " + "total weight is " + totalWeight1 + ", " + "total height is " + totalHeight1);

        //5.
        //Створити клас Car
        //- кінські сили (або потужність)
        //- об'єм двигуна
        //+ 5 полів придумати самостійно
        //
        //Створити 10 об'єктів класу Car.
        //Скласти між собою значення їх об'ємів і вивести в консоль.
        //Скласти між собою значення їх потужностей і вивести в консоль.

        Car subaru = new Car("subaru", "outback", 2020, 12000, 250, 2, true);
        Car audi = new Car("audi", "A4", 2020, 12000, 250, 2, true);
        Car kia = new Car("kia", "sportage", 2020, 12000, 250, 2, true);
        Car honda = new Car("honda", "Civic", 2020, 12000, 250, 2, true);
        Car citroen = new Car("citroen", "C4", 2020, 12000, 250, 2, true);
        Car cherry = new Car("cherry", "200", 2020, 12000, 250, 2, true);
        Car ford = new Car("ford", "focus", 2020, 12000, 250, 2, true);
        Car VW = new Car("VW", "golf", 2020, 12000, 250, 2, true);
        Car renault = new Car("renault", "megan", 2020, 12000, 250, 2, true);
        Car man = new Car("man", "q300", 2020, 12000, 250, 2, true);



        int totalPower = 0;
        int totalVolume = 0;
        List<Car> cars = List.of(subaru, audi, kia, honda, citroen, cherry, ford, VW, renault, man);
        for(Car car : cars){
            totalPower += car.getPower();
            totalVolume += car.getVolume();
        }
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("total power is " + totalPower + ", total volume is " + totalVolume);

        //6.
        //Зробити завдання 5 , але 10 об'єктів покласти в масив.
        //Скласти між собою значення їх об'ємів і вивести в консоль.
        //Скласти між собою значення їх потужностей і вивести в консоль.

        int totalPower1 = 0;
        int totalVolume2 = 0;
        Car[] cars1 = {
                subaru,
                audi,
                kia,
                honda,
                citroen,
                cherry,
                ford,
                VW,
                renault,
                man
        };
        for(Car car : cars1){
            totalPower1 += car.getPower();
            totalVolume2 += car.getVolume();
        }
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("total power is " + totalPower1 + ", total volume is " + totalVolume2);
    }


}
