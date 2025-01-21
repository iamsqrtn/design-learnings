package pattern.behavioral.cor;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String msg) {
        if (logLevel == LogLevel.DEBUG) {
            System.out.println(msg);
        } else {
            System.out.println("DEBUG cannot handle " + logLevel);
            super.log(logLevel, msg);
        }
    }
}
