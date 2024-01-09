package Quiz5prep.Strategy;

public class TextEditor {
    private TextFormatter textFormatter;

    public void setFormatter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public String formatText(String text){
        return textFormatter.formatText(text);
    }
}
