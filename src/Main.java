import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        File file = new File(20);
	Uploader uploader=new Uploader("Upload",file);
	uploader.start();
        try {
            uploader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            Semaphore semaphore = new Semaphore(2,true);
        for (int i = 1; i <=10 ; i++) {
            Downloader downloader = new Downloader(semaphore,i);
            downloader.start();

        }


    }

}
