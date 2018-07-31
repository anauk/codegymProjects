package solutions.lesson240618;

import java.util.Scanner;
/*
Дана строка из слов.
Необходимо пройтись по строке, и произвести следущие операции:
Первую букву для всех слов, которые длинее одного символа сделать большой
остальные сделать маленькими вне зависимости от того такими они были.
 */

public class Exercize0 {
    private static String capitalizeFirst(String src) {
        char [] res = src.toCharArray();
        for (int i = 0; i< src.length(); i++) {
            if(i == 0 || res[i-1] == ' ' && i < res.length-1)
                res[i] = Character.toUpperCase(res[i]);
        }
        return new String(res);
    }
    public static void main(String[] args) {
        String s = "adf dtg tyo rtu";
        System.out.println("Строка до обработки: " + s);
        Scanner in = new Scanner (s);
        String src = in.nextLine();
        String res= capitalizeFirst(src);
        System.out.println("Строка после обработк: " + res);
    }
}
