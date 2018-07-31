package solutions.july0407;

import java.io.*;
import java.util.Scanner;
/*Написать метод класса, реализующий перевод строки в число
        с обработкой NumberFormatException*/
public class Exeption {
    public static void main_(String[] args) {
        Scanner in = new Scanner("4.5");
        String s = in.nextLine();
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch(NumberFormatException ee) {
            System.out.println("-1");
        }
    }

    /* добавить параметр к методу, который определяет число
    которое будет возвращено при возникновении NumberFormatException*/
    public static void main1(String[] args) {
        Scanner in = new Scanner("4");
        String s = in.nextLine();
        int resultOfConv2 = convert2(s, -33);
        System.out.println(square(resultOfConv2));
    }
    public static int convert2 (String s,int defVal){
        int res = defVal;
    try{
        res = Integer.parseInt(s);
//        return i;
    } catch(NumberFormatException e) {
        System.out.println("error");
        }
        return res;
    }
    /*public static int convert2 (String s,int defVal) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defVal;
        }
    }*/
    private static int square (int num){
        return num*num;
    }
    /*прочитать файл. При отсутствии файла словить FileNotFoundException
    и выдать пользователю сообщение "file <имя файла> not found."*/
    public static boolean main2(File f) {
        try {
            BufferedReader bf =  new BufferedReader(new FileReader(f));
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    public static void main3(String[] args) {
        File f = new File("src/main/java", "ter.txt");
        if (!main2(f)) {
            System.out.printf("file %s not found", f); //f-is a name of file
        }
    }


    public static int error(File f) {
        try {
            BufferedReader bf =  new BufferedReader(new FileReader(f));
            bf.readLine();
            return 0;
        } catch (FileNotFoundException e) {
            return -1;
        } catch (IOException e) {
            return -2;
        }
    }
    public static void main4(String[] args) {
        File f = new File("src/main/java/solutions/july0407", "ter.txt");
        int k = error(f);

    }

    public static void main(String[] args) {
       // System.out.println(reader);
    }
}
