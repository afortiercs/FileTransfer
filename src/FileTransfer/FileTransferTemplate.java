package FileTransfer;

/**
 * Created by afortier on 4/8/2017.
 */
public abstract class FileTransferTemplate {
    public void transferFile(){
        selectFile();
        setUpFile();
        setUpSocket();
        sendFile();
    }

    abstract void selectFile();
    abstract void setUpFile();
    abstract void setUpSocket();
    abstract void sendFile();

}

