import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        File file = new File(20);
        Uploader uploader = new Uploader("Upload", file);
        uploader.start();
        try {
            uploader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
Semaphore semaphore = new Semaphore(3,true);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 1; i <= 10; i++) {
            Downloader downloader = new Downloader(semaphore,countDownLatch, i);
            downloader.start();
        }
        countDownLatch.await();
        System.out.println("Файл удален с сервера");
    }

}
