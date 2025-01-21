package pattern.behavioral.cor;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        System.out.println("For INFO Message");
        logProcessor.log(LogLevel.INFO, "INFO Message Logged");
        System.out.println("For DEBUG Message");
        logProcessor.log(LogLevel.DEBUG, "DEBUG Message Logged");
        System.out.println("For ERROR Message");
        logProcessor.log(LogLevel.ERROR, "ERROR Message Logged");
    }
}
