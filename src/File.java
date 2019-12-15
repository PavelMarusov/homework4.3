public class File {
   final int FILE = 500;
    int downloadSpeed ;

    public File(int downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public int getFILE() {
        return FILE;
    }

    public int getDownloadSpeed() {
        return downloadSpeed;
    }
}
