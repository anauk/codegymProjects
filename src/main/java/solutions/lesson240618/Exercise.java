package solutions.lesson240618;

import java.io.*;
import java.util.*;
/* Дан массив из целочисленных значений.
Необходимо пройти по массиву и произвести следущую операцию:
те числа которые без остатка делятся на 2 - разделить на 2;
те числа которые без остатка делятся на 3 - разделить на 3;
остальные - умножить на два
Распечатать получившийся массив
*/
public class Exercise {
    public static void main(String[] args) {
        String input = "7 12 3 4 5 6 3 25";
        Scanner in = new Scanner (input);

        System.out.println("Массив до: " + input);

        int size = in.nextInt();
        int [] intArray = new int [size];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = in.nextInt();
            if (intArray[i] % 2 == 0) {
                intArray[i] /= 2;
                System.out.print(intArray[i] + " ");
            } else if (intArray[i] % 3 == 0) {
                intArray[i] /= 3;
                System.out.print(intArray[i] + " ");
            } else if (intArray[i] % 2 != 0 && intArray[i] % 3 != 0){
                intArray[i] *= 2;
                System.out.print(intArray[i] + " ");
            }
        }
       /* for (int i = 0; i < c.length; i++) {
            System.out.printf("%s->%d \n", s[i], s);// чтобы заменить sout в каждом if
        }*/
        System.out.println(Arrays.toString(intArray));//тоже сразу выдает весь масив
    }
}
