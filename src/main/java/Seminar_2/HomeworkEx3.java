package Seminar_2;
import java.io.File;

public class HomeworkEx3 {

//    Напишите метод, который определит тип (расширение) файлов из текущей папки
//    и выведет в консоль результат вида:
//
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg


    public static void main(String[] args) {
        File file = new File("C:\\DOWN\\JAVA\\lrnJava2023");
        String[] fileExtList = file.list();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fileExtList.length; i++) {
            String fileName = fileExtList[i];
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                sb.append(i+1).
                        append(". Расширение файла: ").
                        append(fileName.substring(fileName.lastIndexOf(".")+1)).
                        append(System.lineSeparator());

            }
            else sb.append(i+1).
                    append(". Расширение файла: ").
                    append("").
                    append(System.lineSeparator());
        }
    System.out.println(sb);
    }
}