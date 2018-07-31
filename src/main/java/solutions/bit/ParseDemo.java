package solutions.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.BitSet;
import java.util.Scanner;

public class ParseDemo {
    public static void main1(String[] args) throws IOException {
        // программа для суммирования целых чисел, вводимых пользователем
        //преобразует строковое представление числа в целое значение через метод parseInt()
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Take your number, 0 - for exict");
        do {
            str = bf.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("vrong format");
                i = 0;
            }
            sum += i;
            System.out.println("sum: " + sum);
        } while (i != 0);
    }

    public static void main2(String[] args) throws IOException {
        //преобразование целого чмсла в двоичною,восми- и 16-ную формы
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        do {
            System.out.println("Print number");
            str = bf.readLine();
            try {
                i = Integer.parseInt(str);
                System.out.println(i + "in binar form: " + Integer.toBinaryString(i));
                i |= (1<<2);
                System.out.println(Integer.toBinaryString(i)+ " " + i);
                System.out.println(i + "in 16-form: " + Integer.toHexString(i));
                System.out.println(i + "in 8-form: " + Integer.toOctalString(i));
            } catch (NumberFormatException e) {
                System.out.println("You are mistake");
                i = 0;
            }
        } while (i != 0);
    }

    public static void main3(String[] args) {
        //как получить значение определенного бита в битовой маске?
        int a = 15;
        a &= ~(1<<2);// установить в 0 бит 2 : (0100)=~(1011)=1111&1011=1011
        int c = a & (1<<2); //узнаем про 2 бит: 1011&0100=0000
        int d = a & (1<<3); //узнаем про 3 бит: 1011&1000=1000=8
        System.out.println(Integer.toBinaryString(a) + " " + a + " " + c + " " + d);
        // как установить бит в ноль в битовой маске?
    }

    public static void main_(String[] args) {
        Scanner in = new Scanner("334 4");

       int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        int pos = in.nextInt();
        pos = ~(pos<<1);
        System.out.println(pos + " " + Integer.toBinaryString(pos));

        a &= pos;
        System.out.println(a +" "+ Integer.toBinaryString(a));

    }

    public static void mainq(String[] args) {
        Scanner in = new Scanner("334 4");
        int a = in.nextInt();
        System.out.println(a);
        int pos = in.nextInt();
        pos = 1<<(pos-1);
        System.out.println(pos);
        a = a&(~pos);
        System.out.println(a);
    }

   /* public static void main(String[] args) {
        Scanner in = new Scanner("32");
        int a = in.nextInt();
        int pos = 1;
        while (a != 0) {
            if ((a & 1)) {
                System.out.println(pos);
            }
a << 1;
            ++pos;
        }

    }*/
}
