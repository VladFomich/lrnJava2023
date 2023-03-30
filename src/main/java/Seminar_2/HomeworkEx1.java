package Seminar_2;
import java.util.Scanner;
public class HomeworkEx1 {

//1. Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод строки: ");
        String str = scanner.nextLine().toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        System.out.println("Булевое значение проверки: " + isPalindrome(str));
    }
    private static Boolean isPalindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

}
