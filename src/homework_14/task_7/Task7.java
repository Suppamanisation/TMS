package homework_14.task_7;

public class Task7 {
    public static void main(String[] args) {
        Man man = new Man("Nikita", "+375293260333");
        Man man1 = new Man("Nikita", "Marinets", "+375293260333");
        Man man2 = new Man("Nikita", "Marinets");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(man2);
    }
}
