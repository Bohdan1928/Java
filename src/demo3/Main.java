package demo3;

public class Main {
    public static void main(String[] args) {

        Human human = new Human() {
            @Override
            public void live() {
                System.out.println("qwerty");
            }
        };
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        calculator.calculate(10, 11);

        Calculator calculator1 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        calculator1.calculate(10, 20);

        Calculator calculator2 = (a, b) -> a * b;
        calculator2.calculate(11,11);
    }
}
