package homework_10.task_1;

/*Task 1
        Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
        который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())*/
public class Runner {
    public static void main(String[] args) {
        Shell<Box> shell = new Shell<>(new Box());
        System.out.println("Название класса и путь: " + shell.getThisItem());
    }
}
