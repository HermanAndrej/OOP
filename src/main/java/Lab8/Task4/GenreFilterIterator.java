package Lab8.Task4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist;
    private String targetGenre;
    private int currentIndex = 0;

    public GenreFilterIterator(List<Song> playlist, String targetGenre){
        this.playlist = playlist;
        this.targetGenre = targetGenre;
    }
    @Override
    public boolean hasNext() {
        while(currentIndex < playlist.size()){
            if(playlist.get(currentIndex).getGenre().equals(targetGenre)){
                return true;
            }
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }

    @Override
    public Song next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return playlist.get(currentIndex++);
    }
}
