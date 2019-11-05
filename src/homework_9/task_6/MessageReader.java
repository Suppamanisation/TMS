package homework_9.task_6;

import java.io.*;

public class MessageReader {
    private static final String FILE_PATH = "src/homework_9/task_6/meme.jpg";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            String secret = secretInput(file);
            if (!secret.equals("")) {
                System.out.print("Секретик: " + secret);
            } else {
                System.out.print("Нет секретного сообщения");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String secretInput(File file) {
        String secret = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String lastLine;
            while ((lastLine = br.readLine()) != null) {
                secret = lastLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return secret;

    }
}