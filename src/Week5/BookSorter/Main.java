package Week5.BookSorter;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Usta İle Margarita", 883, "Mihail Bulgakov", "1992");
        Book book2 = new Book("The Tomb of Tutankhamen", 236, "Howard Carter", "1972");
        Book book3 = new Book("Semerkant", 746, "Amin Maalouf", "1988");
        Book book4 = new Book("Akhilleus'un Şarkısı", 338, "Madeline Miller", "2020");
        Book book5 = new Book("Holding Up The Universe", 369, "Jennifer Niven", "2016");

        // Set that sorts books by name
        Set<Book> nameSorting = new TreeSet<>();
        nameSorting.add(book1);
        nameSorting.add(book2);
        nameSorting.add(book3);
        nameSorting.add(book4);
        nameSorting.add(book5);

        System.out.println("**SORT BY BOOK NAME**");
        for (Book book : nameSorting) {
            System.out.println(book);
        }

        // Comparator to sort books by page count
        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getPageCount);

        // Set that sorts books by page count
        Set<Book> pageCountSorting = new TreeSet<>(pageCountComparator);
        pageCountSorting.addAll(nameSorting);

        System.out.println("\n**SORT BY PAGE COUNT**");
        for (Book book : pageCountSorting) {
            System.out.println(book);
        }
    }
}