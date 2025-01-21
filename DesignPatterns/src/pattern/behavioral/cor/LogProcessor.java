package pattern.behavioral.cor;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }
    public void log(LogLevel logLevel, String msg) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, msg);
        }
    }
}
