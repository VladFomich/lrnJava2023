package Seminar_2;
import java.io.FileOutputStream;
import java.io.IOException;
public class HomeworkEx2 {

//    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.

    public static void main(String[] args) {
        writer();

    }

    public static StringBuilder textGen() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        return sb;
    }
    public static void writer() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

            fileOutputStream.write(textGen().toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}












