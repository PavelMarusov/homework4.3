import java.util.concurrent.Semaphore;

public class Downloader extends Thread {

    Semaphore semaphore;
    int id =0;
    public Downloader(Semaphore semaphore,int id){
        this.semaphore = semaphore;
        this.id=id;


    }

    @Override
    public void run() {
try {
    sleep(3000);
    semaphore.acquire();
    System.out.println("Пользователь" + id + " начал скачивать"+" скорость загрузки 100 МБ/с");
sleep(3000);
    System.out.println("Пользователь"+ id + " закочил скачивать");
    semaphore.release();
    sleep(3000);


} catch (Exception e){
    System.out.println("Перебор ");
}
        if(id==10){System.out.println("Файл удален с сервера");}

    }
}
