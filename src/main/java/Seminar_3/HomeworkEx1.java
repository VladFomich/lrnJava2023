package Seminar_3;
import java.util.*;
public class HomeworkEx1 {

//    1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//            (в языке уже есть что-то готовое для этого)


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20)); //0 - 19
        }

        System.out.println("Рандомный список чисел: " + list);
        list.removeIf(n -> (n % 2 == 0) );
        System.out.println("Список без чётных чисел: " + list);

    }
}
