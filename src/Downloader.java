import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Downloader extends Thread {

    CountDownLatch cdl;
    Semaphore semaphore = new  Semaphore(2, true);
    int id =0;
    public Downloader(Semaphore semaphore,CountDownLatch cdl,int id){
        this.semaphore = semaphore;
        this.cdl = cdl;
        this.id=id;


    }

    @Override
    public void run() {
try {


    semaphore.acquire();
    System.out.println("Пользователь" + id + " начал скачивать"+" скорость загрузки 100 МБ/с");
sleep(3000);
    System.out.println("Пользователь"+ id + " закочил скачивать");
    semaphore.release();

    cdl.countDown();



} catch (Exception e){
    System.out.println("Перебор ");
}


    }
}
