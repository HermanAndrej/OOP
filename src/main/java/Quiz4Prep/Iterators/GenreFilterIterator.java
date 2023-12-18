package Quiz4Prep.Iterators;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist;
    private String genre;
    private int currentIndex = 0;

    public GenreFilterIterator(List<Song> playlist, String genre){
        this.playlist = playlist;
        this.genre = genre;
    }

    public boolean hasNext(){
        while(currentIndex < playlist.size() && !playlist.get(currentIndex).genre().equals(genre)){
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }

    public Song next(){
        if(hasNext()){
            return playlist.get(currentIndex++);
        }else{
            throw new NoSuchElementException();
        }
    }
}
