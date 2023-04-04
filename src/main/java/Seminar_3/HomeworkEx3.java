package Seminar_3;
import java.util.*;
public class HomeworkEx3 {

//3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

//    Классная работа:

    public static void main(String[] args) {
        List<String> planetsNames = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add(planetsNames.get(random.nextInt(9)));
        }

        System.out.println("* Рандомный список из планет: " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("* Отсортированный список из планет: " + list);

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }else{
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append(list.get(list.size() - 1)).append(": ").append(count).append(".");

//       Домашняя работа:


        System.out.println("* Список с количеством повторений планет: " + sb);
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("* Список из планет без дубликатов: " + list);
    }
}
