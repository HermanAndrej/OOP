package Quiz5prep.Singleton;

import com.mysql.cj.log.Log;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        synchronized (Logger.class){
            if(instance == null){
                instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
    public void logInfo(String message) {
        System.out.println(message);
    }
    public void logWarning(String message) {
        System.out.println(message);
    }
    public void logError(String message) {
        System.out.println(message);
    }

}
