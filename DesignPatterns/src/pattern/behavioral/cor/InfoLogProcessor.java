package pattern.behavioral.cor;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String msg) {
        if (logLevel == LogLevel.INFO) {
            System.out.println(msg);
        } else {
            System.out.println("INFO cannot handle " + logLevel);
            super.log(logLevel, msg);
        }
    }
}
