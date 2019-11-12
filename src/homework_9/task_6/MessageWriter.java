package homework_9.task_6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MessageWriter {
    private static final String FILE_PATH = "src/homework_9/task_6/meme.jpg";

    private static String secret = "lol kek cheburek";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            secretOutput(secret, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void secretOutput(String secret, File file) {
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            // когда записывал в файл, стоило запомнить с какого байта начинается твое сообщение, чтобы потом прочимтать его
            // + кол-во байт в сообщение, чтобы знать сколько байт прочитать
            fos.write(('\n' + secret).getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
