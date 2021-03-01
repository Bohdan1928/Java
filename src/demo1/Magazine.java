package demo1;

import java.util.List;

public class Magazine implements Printable{
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printMagazines(List<Printable> printables){
        for (Printable printable : printables) {
            if (printable instanceof Magazine){
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
