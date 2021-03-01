package demo2;

public class Guitar implements Instruments{
    private String name;
    private int strings;

    public Guitar() {
    }

    public Guitar(String name, int strings) {
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", strings=" + strings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Грає " + getName() + " з кількістю струн " + getStrings());
    }
}
