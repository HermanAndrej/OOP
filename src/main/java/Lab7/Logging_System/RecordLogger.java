package Lab7.Logging_System;

public record RecordLogger(String loggerName) implements Logger{

    @Override
    public void StringMessage(String message) {
        System.out.println(loggerName + " " + message);
    }
}
