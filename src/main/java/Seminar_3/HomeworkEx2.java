package Seminar_3;
import java.util.*;

public class HomeworkEx2 {


//    2. Задан целочисленный список ArrayList.
//    Найти минимальное, максимальное и среднее арифметическое из этого списка.

    private static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20)); //0 - 19
        }

        System.out.println("Рандомный список чисел: " + list);
        System.out.println("Максимальное число в списке: " + Collections.max(list));
        System.out.println("Минимальное число в списке: " + Collections.min(list));
        double avg = getAverage(list);
        System.out.println("Среднеарефметическое списка: " + avg);
    }
}
