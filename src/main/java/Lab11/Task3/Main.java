package Lab11.Task3;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println(textEditor.formatText("So what else is new"));

        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText("So what else is new"));
    }
}
