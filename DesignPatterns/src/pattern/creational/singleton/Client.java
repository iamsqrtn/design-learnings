package pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++) {
            executorService.submit(()->{
                DBConnection.getDBConnection();
            });
        }
        executorService.shutdown();
    }
}
