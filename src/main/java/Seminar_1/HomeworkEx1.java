package Seminar_1;

import java.util.Random;

public class HomeworkEx1 {


//    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы


    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 11);
        }
        int maxNum = arr[0];
        int minNum = arr[0];

        for (int j = 0; j < arr.length; j++){
            if (arr[j] > maxNum) {
                maxNum = arr[j];}
                if (arr[j] < minNum) {
                    minNum = arr[j];}

                }

        System.out.println("max" + maxNum);
        System.out.println("min" + minNum);

    }


}








