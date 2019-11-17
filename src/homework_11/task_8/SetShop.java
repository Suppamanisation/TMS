package homework_11.task_8;

/*Task 8
        Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
        с одинаковым ID и названием и добавить их в ваш Set. Попробуйте разобраться почему они все добавились,
        несмотря на то, что Set обеспечивает уникальность*/

import java.util.HashSet;
import java.util.Set;
 
// +
public class SetShop {
    public static void main(String[] args) {
        Set<Shop> shop = new HashSet<>();
        shop.add(new Shop("ASUS", 123));
        shop.add(new Shop("ASUS", 123));
        shop.add(new Shop("ASUS", 123));
        shop.add(new Shop("ASUS", 123));//объекты добавляются т.к. сравниваются ссылки, нужно переопределить equals() и hashcode() для сравнения содержимого объекта
        System.out.println(shop);
    }
}
