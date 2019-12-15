public class Uploader extends Thread {
    File file;

    public Uploader(String name,File file) {
        this.setName(name);
        this.file = file;
    }

    public void run(){
//        synchronized (file){
            try {

                System.out.println("Загружаю файл размер :"+file.getFILE());
                System.out.println("Скорость загрузки :"+file.getDownloadSpeed() + " Мб/с");
                sleep(5000);
                System.out.println("Фаил загружен");

            }catch (InterruptedException e){}

        }

    }

//}
