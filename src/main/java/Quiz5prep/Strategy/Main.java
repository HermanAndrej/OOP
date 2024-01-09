package Quiz5prep.Strategy;

public class Main {
    public static void main(String[] args) {
        String text = "Misko";
        TextEditor textEditor = new TextEditor();
        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println(textEditor.formatText(text));
        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText(text));
    }
}
