package MidtermPrep.Optionals;

import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books = books;
    }

    public Optional<Book> checkAvailability(String bookTitle){
        return books.stream()
                .filter(book -> book.title().equals(bookTitle))
                .findFirst()
                .filter(book -> book.availabilityStatus());
    }

    public Optional<Book> getByAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equals(author))
                .findFirst();
    }

    public void updateAvailability(String bookTitle, boolean available){
        books.stream()
                .filter(book -> book.title().equals(bookTitle))
                .findFirst()
                .ifPresent(book -> book = new Book(bookTitle, book.author(), book.publicationYear(), available));
    }
}
