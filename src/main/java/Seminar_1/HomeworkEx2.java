package Seminar_1;

import java.util.Arrays;

public class HomeworkEx2 {

//    2. Дан массив nums = [3,2,2,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//    Таким образом, первые несколько (или все) элементов массива должны быть
//    отличны от заданного, а остальные - равны ему.
    public static void main(String[] args) {
        int [] numbers = {3, 2, 2, 3};
        int k = 3;
        int temp = 0;
        int lNum = 0;
        int rNum = numbers.length - 1;
        while (lNum != rNum){
            if (numbers[lNum] == k) {
                if (numbers[rNum] != k) {
                    temp = numbers[rNum];
                    numbers[rNum] = numbers[lNum];
                    numbers[lNum] = temp;
                    rNum--;
                } else {
                    rNum--;
                }}
            else{
                    lNum++;
                }
            }




        System.out.println(Arrays.toString(numbers));
        }

    }

