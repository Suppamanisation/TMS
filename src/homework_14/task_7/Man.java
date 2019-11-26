package homework_14.task_7;

/*Task 7
Сделать класс Man у которого 3 поля - имя, фамилия, тел.номер.
Сделать конструкторы:
1. с параметрами имя тел. номер,
2. с параметрами имя, фамилия тел. номер.
3. с параметрами имя, фамилия.
Конструктора без параметров быть не должно. Избежать дублирования кода*/

public class Man {
    String name;
    String surname;
    String phoneNumber;

    public Man(String name, String field, String ... args) {
        this.name = name;
        if (args.length > 0) {
            this.surname = field;
            this.phoneNumber = args[0];
        } else {
            if (field.matches("(.)*(\\d)(.)*")) {
                this.phoneNumber = field;
            } else {
                this.surname = field;
            }

        }
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
