package MidtermPrep.Optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        Optional box = null;
        System.out.println(box);

        String a = null;
         */
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Communist Manifesto", "Karl Marx", 1848, true));
        books.add(new Book("Thus spoke Zarathustra", "Friedrich Nietzche", 1883, true));
        books.add(new Book("Crime and punishment", "Fyodor Dostoevsky", 1866, false));

        LibraryCatalog libraryCatalog = new LibraryCatalog(books);

        System.out.println(libraryCatalog.checkAvailability("Thus spoke Zarathustra"));
        System.out.println(libraryCatalog.checkAvailability("Crime and punishment"));

        System.out.println(libraryCatalog.getByAuthor("Karl Marx"));
        libraryCatalog.updateAvailability("Crime and punishment", true);
        System.out.println(libraryCatalog.checkAvailability("Crime and punishment"));

    }
}
