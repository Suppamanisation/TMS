package homework_13.task_2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String firstString, String secondString) {
        return firstString.length() - secondString.length();
    }
}
