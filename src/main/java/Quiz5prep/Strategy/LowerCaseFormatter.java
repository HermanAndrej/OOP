package Quiz5prep.Strategy;

public class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
