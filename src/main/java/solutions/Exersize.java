package solutions;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exersize {
    public static void main1(String[] args) {
        System.out.print("Take number:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            //System.out.print(sum);выводит промежуточные результаты суммирования
        }
        System.out.println(sum);// выводит конечный результат
    }
    public static void main2(String[] args) {
        System.out.print("Take number:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N == 1) {
            System.out.println("вы ввели число 1");
        } else {
            System.out.println("вы ввели число не равное 1");
        }
        switch (N){
            case 1: System.out.println ("Вы ввели число 1"); break;
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");
        }
    }

    public static void main3(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        for(Integer number:numbers) {
            System.out.print(number+" ");
        }
        System.out.println("\n");
        numbers.forEach(number-> System.out.println(number));
    }
    public static void main(String[] args) throws Exception {
        int k = 1;
        int k1 = 10;
        newFile(k, k1);
        FileReader fr = new FileReader("text1.txt");
        Scanner in = new Scanner(fr);
        int i=0;
        while(in.hasNextLine()) {
            System.out.println(i + "-" + in.nextLine());
        i++;
        }
        fr.close();
    }

    private static void newFile(int k, int k1)throws Exception {
        FileWriter myFile = new FileWriter("text1.txt");
        for (int i = k; i <= k1; i++) {
            myFile.write(i + "\n");
        }
        myFile.close();
    }
}
