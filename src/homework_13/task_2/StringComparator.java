package homework_13.task_2;

import java.util.Comparator;

// не стоит заводить новый класс, когда можно использовать базовый от java
public class StringComparator implements Comparator<String> {
    public int compare(String firstString, String secondString) {
        return firstString.length() - secondString.length();
    }
}
