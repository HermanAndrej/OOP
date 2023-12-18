package Quiz4Prep.Iterators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("High Regard", "The Story So Far", "Pop punk"));
        playlist.add(new Song("Thousand years", "Christina Perri", "Pop"));
        playlist.add(new Song("Pet Semetery", "Ramones", "Punk rock"));
        playlist.add(new Song("Komuna", "Kreso Bengalka", "Pop punk"));
        playlist.add(new Song("Ti me ne volis", "Negative", "Hard rock"));
        playlist.add(new Song("Quicksand", "The Story So Far", "Pop punk"));

        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, "Pop punk");

        while (genreFilterIterator.hasNext()){
            System.out.println(genreFilterIterator.next());
        }
    }
}
