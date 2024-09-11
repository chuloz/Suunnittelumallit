import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName = "default_log.txt";

    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //staattisen metodin instanssin saaminen
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //Metodi viestien kirjoittamiseen tiedostoon
    public void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodi tiedoston nimen vaihtamiseen
    public void setFileName(String newFileName) {
        try {
            writer.close();
            fileName = newFileName;
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodi tiedoston sulkemiseen
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
