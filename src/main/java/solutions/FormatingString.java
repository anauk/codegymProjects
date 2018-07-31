package solutions;

import java.util.Scanner;

import static com.sun.org.apache.xml.internal.utils.XMLChar.isSpace;
import static java.lang.Character.isLetter;

public class FormatingString {
    public static void main1(String[] args) {
        Scanner in = new Scanner("Donec pharetra,arcu id eleifend .");
        String delimiters = ".,?!:;";
        String src = in.nextLine();

        //Для формирования результата без перекопирования строки при каждой конкатенации
        StringBuilder result = new StringBuilder();

        //Признак, что предыдущий символ был разделителем
        boolean prevCharIsDelimiter = false;
        //По символам строки
        for (int i = 0; i < src.length(); i++) {
            //Сохранить текущий символ в локальную перменную,
            //чтобы каждый раз не вызывать метод получения по индексу
            char ch = src.charAt(i);
            //Если символ является разделителем, то отметить этот факт в prevCharIsDelimiter
            if (delimiters.indexOf(ch) != -1) {
                prevCharIsDelimiter = true;                //Если символ НЕ разделитель
            } else {                //Если символ НЕ пробел и предыдущий символ разделитель, то добавить пробел.
                if (ch != ' ' && prevCharIsDelimiter) {
                    result.append(' ');
                }                //Снять признак "разделитель" для следующей итерации цикла
                prevCharIsDelimiter = false;
            }            //Добавить текущий символ в выходную строку
            result.append(ch);
        }
        System.out.format("\nsrc:\t%s\nresult:\t%s\n", src, result);
    }

    /*public static void main(String[] args) {
        Scanner in = new Scanner("Donec pharetra,arcu id eleifend .");
        String src = in.nextLine();
        //Для формирования результата без перекопирования строки при каждой конкатенации

      public static boolean isCharDelimiter(char c){
            return c==','|| c==';'|| c=='.' || c=='?' || c=='!';
        }

        public static boolean isSpace(char c) {
            return c==' ';// является ли пробелом
        }

        public static boolean isLetter(char c) {
            return isLetter(c);// является ли буквой
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            //Сохранить текущий символ в локальную перменную,
            //чтобы каждый раз не вызывать метод получения по индексу
            char ch = src.charAt(i);
            if (i>0 && isLetter(ch) && isCharDelimiter(ch)) {
                result.append(" ");
                result.append(ch);
            } else if (isLetter(ch)
                || isCharDelimiter(ch) && isLetter(lastChar(result))
                || i+1<src.length() && isSpace(ch) && isLetter(src.charAt(i+1))) {
                result.append(ch);
            }
            }
        System.out.format("\nsrc:\t%s\nresult:\t%s\n", src, result);
    }

    private static boolean isCharDelimiter(char c) {
        return c==','|| c==';'|| c=='.' || c=='?' || c=='!';
    }*/
}


