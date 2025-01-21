package pattern.behavioral.cor;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String msg) {
        if (logLevel == LogLevel.ERROR) {
            System.out.println(msg);
        } else {
            System.out.println("ERROR cannot handle " + logLevel);
            super.log(logLevel, msg);
        }
    }
}
