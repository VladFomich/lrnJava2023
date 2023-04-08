package Seminar_5;
import java.util.*;
public class HomeworkEx1 {

//    Реализуйте структуру телефонной книги с помощью HashMap,
//    учитывая, что 1 человек может иметь несколько телефонов.


    private HashMap<String, List> contacts;

    public HomeworkEx1() {
        contacts = new HashMap<String, List>();
    }

    public void addPhoneToPB(String name, String number) {
        List numbers;
        if (contacts.containsKey(name)) {
            numbers = contacts.get(name);
        } else {
            numbers = new ArrayList();
            contacts.put(name, numbers);
        }
        numbers.add(number);
    }

    public void printPB() {
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            List numbers = contacts.get(name);
            for (Object number : numbers) {
                System.out.print(number + ";  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HomeworkEx1 phoneBook = new HomeworkEx1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Добавить контакт  ||  2: Вывести Справочник  ||   3: Выход");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Введите имя:");
                String name = scanner.next();
                System.out.println("Введите номер:");
                String number = scanner.next();
                phoneBook.addPhoneToPB(name, number);
            } else if (option == 2) {
                phoneBook.printPB();
            } else if (option == 3) {
                System.out.println("Работа со справочником завершена");
                break;
            }
        }
    }
}
