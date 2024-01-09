package Quiz5prep.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("aaa");
        Logger log2 = Logger.getInstance();
        log2.logInfo("asda");

        if(log1==log2){
            System.out.println("same");
        }
    }
}
