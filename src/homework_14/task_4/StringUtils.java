package homework_14.task_4;

/*Task 4
Написать StringUtils класс который умеет искать в тексте слова-полиндромы.
Результат работы программы - вывод на консоль всех полиндромов из текста.
Учесть что в тексте могут быть запятые, точки, вопросительные и восклицательные знаки.
Пример строка: камень, бакаб и пороороп!
На экран должен быть вывод двух последних слов*/

public class StringUtils {

    public static void findPalindromes(String string) {
        string = string.replaceAll("\\pP", "");
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equalsIgnoreCase(new StringBuilder(word)
                    .reverse().toString())) {
                System.out.println(word);
            }
        }
    }
}
