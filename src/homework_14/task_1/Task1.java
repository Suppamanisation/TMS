package homework_14.task_1;

import java.util.Scanner;

/*Task 1
Есть приветственное предложение:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Необходимо сделать так, чтобы можно было подставить любое имя и язык программирования.
Напишите программу, которая бы позволяла вводить имя и язык программирования с консоли и затем выводила на экран
полученное предложение*/

public class Task1 {
    public static void main(String[] args) {
        // используй шаблон String.format() %s, %d
        String str = "Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company.";
        StringBuffer hello = new StringBuffer("Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company.");
        System.out.println(hello);
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR DEV LANG");
        String dev = sc.next();
        System.out.println("ENTER YOUR NAME");
        String name = sc.next();
        String str1 = str.replace("Alex", name);
        String str2 = str1.replace("java", dev);
        System.out.println(str2);
        ///////////////////////////////////////////
        hello.replace(28, 32, dev);
        hello.replace(18, 22, name);
        System.out.println(hello);
    }
}
