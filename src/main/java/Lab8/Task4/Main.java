package Lab8.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>(Arrays.asList(
                new Song("Sliver", "Nirvana", "Grunge"),
                new Song("Institutionalized", "Suicidal Tendencies", "Punk Rock"),
                new Song("Linoleum", "NOFX", "Punk Rock"),
                new Song("Rooster", "Alice In Chains", "Grunge"),
                new Song("Always", "Blink 182", "Pop Punk"),
                new Song("Plush", "Stone Temple Pilots", "Grunge")
        ));

        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, "Grunge");
        while (genreFilterIterator.hasNext()){
            System.out.println(genreFilterIterator.next());
        }
    }
}
