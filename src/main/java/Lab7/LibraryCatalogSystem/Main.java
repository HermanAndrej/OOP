package Lab7.LibraryCatalogSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Communist Manifesto", "Karl Marx", 1848, true));
        books.add(new Book("Thus spoke Zarathustra", "Friedrich Nietzche", 1883, true));
        books.add(new Book("Crime and punishment", "Fyodor Dostoevsky", 1866, false));
        LibraryCatalog libraryCatalog = new LibraryCatalog(books);

        System.out.println(libraryCatalog.checkBookAvailability("Crime and punishment"));

        System.out.println(libraryCatalog);

        libraryCatalog.updateAvailability("Crime and punishment", true);

        System.out.println(libraryCatalog);

        System.out.println(libraryCatalog.bookByAuthor("Karl Marx"));
    }
}
