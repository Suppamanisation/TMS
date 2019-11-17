package homework_11.task_11;

/*Task 11
        Есть TreeSet имен, необходимо выбрать все от "H" до "W" (regex (регэксп))*/

import java.util.TreeSet;

public class Task11 {
    public static void main(String[] args) {
        TreeSet<String> namesTreeSet = new TreeSet<>();

        namesTreeSet.add("Vasya");
        namesTreeSet.add("Petya");
        namesTreeSet.add("Zinaida");
        namesTreeSet.add("Irina");
        namesTreeSet.add("Halina");
        namesTreeSet.add("Zoya");
        namesTreeSet.add("Vladislav");
        namesTreeSet.add("Arkadiy");
        namesTreeSet.add("Vyacheslav");
        namesTreeSet.add("Ganna");
        namesTreeSet.add("Anatoliy");
        namesTreeSet.add("Jack");
        namesTreeSet.add("Nikita");
        namesTreeSet.add("Ludmila");
        namesTreeSet.add("Timur");
        namesTreeSet.add("Wallmart");
        namesTreeSet.add("Xavier");

        System.out.println(namesTreeSet);
        System.out.println(namesTreeSet.subSet("H", "X"));
            // а если до Z понадобится? есть вариант метода subset с 4 аргументами
    }
}
