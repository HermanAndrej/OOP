package Lab7.LibraryCatalogSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books = books;
    }

    public Optional<Book> checkBookAvailability(String bookTitle){
        return books.stream()
                .filter(book -> book.bookTitle().equals(bookTitle))
                .findFirst()
                .filter(book -> book.availabilityStatus());
    }

    public Optional<Book> bookByAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equals(author))
                .findFirst();
    }

    public void updateAvailability(String title, boolean available) {
        books.stream()
                .filter(book -> book.bookTitle().equals(title))
                .findFirst()
                .ifPresent(book -> book = new Book(title, book.author(), book.publicationYear(), available));
    }

    @Override
    public String toString(){
        String str = "";
        if(books.isEmpty()){
            return "No books";
        }else{
            for(Book book: books){
                str = str + book.bookTitle() + " " + book.publicationYear() + " by " + book.author() + ". " + book.availabilityStatus() + "\n";
            }
        }
        return str;
    }
}
