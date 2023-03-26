package Seminar_1;
import java.util.Scanner;
import java.time.LocalTime;
public class HomeworkEx3 {
//    3*. В консоли запросить имя пользователя. В зависимости от текущего времени,
//    вывести приветствие вида:
//
//    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        LocalTime now = LocalTime.now();
        LocalTime time1 = LocalTime.of(5, 00);
        LocalTime time2 = LocalTime.of(12, 00);
        LocalTime time3 = LocalTime.of(18, 00);
        LocalTime time4 = LocalTime.of(23, 00);
        if (now.isAfter(time1) && now.isBefore(time2)){
            System.out.printf("Добрый утро, %s!", name);}
        if (now.isAfter(time2) && now.isBefore(time3)){
            System.out.printf("Добрый день, %s!", name);}
        if (now.isAfter(time3) && now.isBefore(time4)){
            System.out.printf("Добрый вечер, %s!", name);}
        if (now.isAfter(time4) && now.isBefore(time1)){
                System.out.printf("Доброй ночи, %s!", name);}

        }

    }

