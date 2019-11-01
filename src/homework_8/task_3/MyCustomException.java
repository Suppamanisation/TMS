package homework_8.task_3;

public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
