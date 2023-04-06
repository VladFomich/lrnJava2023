package Seminar_4;
import java.util.*;
public class HomeworkEx1 {

//1. Реализовать консольное приложение, которое:
//   Принимает от пользователя и “запоминает” строки.
//   Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//   а первая - последней.
//   Если введено revert, удаляет предыдущую введенную строку из памяти.


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.print("Введите строку: ");
            String text = in.nextLine();
            int SIZE = list.size();

            if (text.equals("exit")) {
                System.out.println("Работа программы завершена");
                break;
            }else if (text.equals("print")) {
                Deque<String> relist = new LinkedList<>();
                for (int i = SIZE - 1; i >= 0; i--) {
                    relist.add(list.get(i));
                }
                System.out.println("Обратный текущий список" + relist);

            } else if (text.equals("revert")) {
                list.remove(SIZE - 1);
                System.out.println("Удалена последняя строка с списке: " + list);

            } else {
                list.add(text);
                System.out.println("Текущий список: " + list);
            }

        }
    }
}