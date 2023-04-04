package Seminar_3;
import java.util.*;
public class HomeworkEx4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","1","b","2","c","3"));



        System.out.println("Список числовых и строковых значений: " + list);
        for(int i = 0; i < list.size(); i++){
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
            }
            catch (NumberFormatException ignored) {}
        }
        System.out.println("Список без числовых значений: " + list);
    }
}
