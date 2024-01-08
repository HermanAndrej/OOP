package Lab11.Task1;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("First message");
        Logger errorLogger = Logger.getInstance();
        errorLogger.logError("This is an error");

        if(log1.equals(errorLogger)){
            System.out.println("It's the same!");
            System.out.println(log1.toString());
            System.out.println(errorLogger.toString());
        }
    }
}
