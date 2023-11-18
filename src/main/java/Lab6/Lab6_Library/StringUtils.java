package Lab6.Lab6_Library;

public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();
        return word.contains(searched);
    }
}
