package Seminar_6;
import java.util.*;

public class HomeworkFinal {

//
//    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков (ArrayList).
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//    Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//    Выводить только те ноутбуки, что соответствуют условию
//


    public static void main(String[] args) {


        System.out.println("Добро пожаловать в типа магизин типа ноутбуков 'Фомич и сыновья'");

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Xiaomi", "RedmiBook", "Intel Core i3", 4, 256, "Чёрный", 39999));
        laptops.add(new Laptop("ASUS", "TUF Gaming A15", "AMD Ryzen 5", 8, 512, "Белый", 59999));
        laptops.add(new Laptop("MSI", "Katana GF76", "Intel Core i5", 16, 512, "Красный", 95999));
        laptops.add(new Laptop("HUAWEI", "MateBook 16S", "Intel Core i9", 16, 1024, "Металик", 118999));
        laptops.add(new Laptop("Acer", "Aspire", "Intel Core i3", 2, 256, "Чёрный", 25000));


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n Выберите:\n 1 - Показать ноутбуки в наличии || 2 - Поиск || 3 - Покинуть магазин");
            int num = scan.nextInt();
            scan.nextLine();
            if (num == 1) {
                System.out.println("Список ноутбуков в наличии: ");
                for (Laptop laptop : laptops) {
                    System.out.println(laptop.toString());
                }

            }

            if (num == 2) {
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Выберите показатель:\n 1 - Размер оперативной памяти || 2 - Объём жесткого диска || 3 - цвет");
                int searchOpt = scan2.nextInt();
                if (searchOpt == 1) {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.print("Введите минимальный размер оперативной памяти(от 2 до 16): ");
                    int inputRamSize = scan3.nextInt();
                    ArrayList<Laptop> searchResult = new ArrayList<>();
                    for (Laptop laptop : laptops) {
                        if (laptop.getRamSize() >= inputRamSize) {
                            searchResult.add(laptop);
                        }

                    }
                    if (searchResult.isEmpty()) {
                        System.out.print("\nСовпадений нет\n");
                    } else {
                        System.out.println("Результат поиска: ");
                        for (Laptop laptop : searchResult) {
                            System.out.println(laptop.toString());
                        }
                    }
                    continue;

                }
                if (searchOpt == 2) {
                    Scanner scan4 = new Scanner(System.in);
                    System.out.print("Введите минимальный объем жесткого диска(от 256 до 1024): ");
                    int inputStorageSize = scan4.nextInt();
                    ArrayList<Laptop> searchResult = new ArrayList<>();
                    for (Laptop laptop : laptops) {
                        if (laptop.getStorageSize() >= inputStorageSize) {
                            searchResult.add(laptop);
                        }

                    }
                    if (searchResult.isEmpty()) {
                        System.out.print("\nСовпадений нет\n");
                    } else {
                        System.out.println("Результат поиска: ");
                        for (Laptop laptop : searchResult) {
                            System.out.println(laptop.toString());
                        }
                    }
                    continue;


                }
                if (searchOpt == 3) {

                    Scanner scan5 = new Scanner(System.in);
                    System.out.print("Введите основной цвет: ");
                    String color = scan5.next();

                    ArrayList<Laptop> filteredLaptops = new ArrayList<>();
                    for (Laptop laptop : laptops) {
                        if (laptop.getColor().toLowerCase().equals(color.toLowerCase())) {
                            filteredLaptops.add(laptop);
                        }

                    }
                    if (filteredLaptops.isEmpty()) {
                        System.out.print("\nСовпадений нет\n");
                    } else {
                        System.out.println("Результат поиска: ");
                        for (Laptop laptop : filteredLaptops) {
                            System.out.println(laptop.toString());
                        }
                    }
                    continue;

                }

            }
            if (num == 3) {
                System.out.print("\n До новых встреч!");
                System.exit(1);
            }


        }
    }
}