package demo1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book();
        Book secondBook = new Book();
        Book thirdBook = new Book();

        Magazine firstMagazine = new Magazine();
        Magazine secondMagazine = new Magazine();
        Magazine thirdMagazine = new Magazine();

        List<Printable> allPaper= List.of(firstBook, secondBook, thirdBook, firstMagazine, secondMagazine, thirdMagazine);

        for (Printable printable : allPaper){
            printable.print();
        }
        Magazine.printMagazines(allPaper);
        System.out.println("|");
        System.out.println("|");
        Book.printBooks(allPaper);
    }
}
