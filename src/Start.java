import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Person user1 = new Person();

        user1.setName("Bohdan");
        user1.setOld(20);
        user1.setSex("man");
        user1.setMaritalStatus(false);

        System.out.println(user1);

        Person user2 = new Person("Bohdan", 19, "man");

        String user2Name = user2.getName();
        int user2Old = user2.getOld();
        String user2Sex = user2.getSex();
        boolean user2MaritalStatus = user2.getMaritalStatus();
        System.out.println(user2);

        Car car1 = new Car();

        car1.setProducer("Audi");

        String[] model = new String[2];
        model[0] = "A3";
        model[1] = "A4";

        car1.setModel(model);
        System.out.println(Arrays.toString(model));

        Person person = new Person("Bohdan", 19);

        Car car2 = new Car("Audi", model, 2, person);
        System.out.println(car2);

        Car car3 = new Car("Audi", model, 2, "Bohdan", 20);
        System.out.println(car3);

    }
}
