package Lab7.Logging_System;

public class Main {
    public static void main(String[] args) {
        RecordLogger recordLogger = new RecordLogger("Record Logger");
        ClassLogger classLogger = new ClassLogger("Class Logger");

        Logger lambdaRecordLogger = (message) ->
                System.out.println(message);

        Logger lambdaClassLogger = (message) ->
                System.out.println(message);

        lambdaRecordLogger.StringMessage("a");

        lambdaClassLogger.StringMessage("b");
    }
}
