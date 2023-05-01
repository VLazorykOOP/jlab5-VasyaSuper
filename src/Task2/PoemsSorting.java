package Task2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PoemsSorting {

    public static void main(String[] args) {

        String author = "Леся Українка";

        List<String> poems = new ArrayList<>();

        //Додаємо назви віршів автора до списку
        poems.add("Надія");
        poems.add("Конвалія");
        poems.add("Сафо");
        poems.add("Вечірня година");
        poems.add("Do");

        //Відсортовуємо за зростанням довжини рядків
        Collections.sort(poems, Comparator.comparing(String::length));

        System.out.println("Список віршів " + author + ", відсортований за зростанням довжини рядків:");

        for (String poem : poems) {
            System.out.println(poem);
        }
    }
}
