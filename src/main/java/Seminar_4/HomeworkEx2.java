package Seminar_4;
import java.util.*;
public class HomeworkEx2 {

//2. Пусть дан LinkedList с несколькими элементами.
//   Реализуйте метод, который вернет “перевернутый” список.


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "apple", "orange", "banana", "tomato", "strawberry",
                                      "melon", "blueberry");
        System.out.println("Текущий список: " + list);

        LinkedList<String> relist = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            relist.add(list.get(i));
        }
        System.out.println("Обратный список: " + relist);

    }
}
