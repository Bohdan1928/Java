package lesson2.interface_demo;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Teacher teacher = new Teacher();
        checkRunners(teacher);

    }
    public static void checkRunners(Runner runner) {
        runner.doRun();
    }
}