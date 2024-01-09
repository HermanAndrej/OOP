package Quiz5prep.Strategy;

public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
