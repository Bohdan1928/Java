package Task2;

import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    public User() {
    }

    public User(int id, String name, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    static void getUserId(List<User> users){
        for(User user : users){
            if((user.getId() % 2) == 0){
                System.out.println(user);
            }
        }
    }
    static void getUserLengthName(List<User> users){
        for(User user : users){
            if((user.getName().length()) >= 5){
                System.out.println(user);
            }
        }
    }
    static void getOnlyWomen(List<User> users){
        for(User user : users){
            if(user.sex == Sex.Women){
                System.out.println(user);
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
