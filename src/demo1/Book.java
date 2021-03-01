package demo1;

import java.util.List;

public class Book implements Printable{
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printBooks(List<Printable> printables){
        for(Printable printable : printables){
            if(printable instanceof Book){
                System.out.println(printable);
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}
