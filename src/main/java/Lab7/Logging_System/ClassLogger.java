package Lab7.Logging_System;

public class ClassLogger implements Logger{
    private String loggerName;
    public ClassLogger(String loggerName){
        this.loggerName = loggerName;
    }

    @Override
    public void StringMessage(String message){
        System.out.println(message + " " + loggerName);
    }
}
