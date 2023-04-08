package Seminar_5;

import java.util.*;
public class HomeworkEx2 {


//Пусть дан список сотрудников. Написать программу, которая найдёт
// и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

    public static List<String> employees = new ArrayList<>(Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
                        ));

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (String empl : employees) {
            String emplName = empl.split(" ")[0];
            if (map.containsKey(emplName)) {
                map.put(emplName, map.get(emplName) + 1);
            } else {
                map.put(emplName, 1);
            }

        }
        map.entrySet().removeIf(entry -> entry.getValue() == 1);
        List<Map.Entry<String, Integer>> employeesSortList = new ArrayList<>(map.entrySet());
        employeesSortList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println("Повторяющиеся имена в порядке убывания: " + employeesSortList);

    }
}