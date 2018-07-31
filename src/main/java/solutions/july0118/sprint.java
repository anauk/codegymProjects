package solutions.july0118;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class sprint {
    public static void main_(String[] args) {
        int c = 10;
        int width = 20;
        int shift=5;
        Random random = new Random();
        int[] numbers = new int[c];
        int size = numbers.length;
        int i = 0;
        while (i < c) {
            numbers[i] = random.nextInt(width)+shift;
            i++;
        }
        System.out.println(Arrays.toString(numbers) + "массив случайных чисел");
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] *= 2;
        }
        System.out.println(Arrays.toString(numbers) + "после умножения");
    }
    public static void main(String[] args) throws IOException {
        //Random r = new Random();
        int[] num = new int[15];
        //int i = 0;
        //while (i < num.length) {
        //    num[i] = r.nextInt(4+1)+3;
        //    i++;
        //}
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*4+3);
        }
        System.out.println(Arrays.toString(num) + "befor");
        for (int j = 0; j < num.length; j++) {
            num[j] *=num[j];
        }
        System.out.println(Arrays.toString(num) + "after");

        File c = new File("rez.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(c));
        for(int el:num) {
            String s = Integer.toString(el);
            bf.write(s);
            bf.write("\n");
        }
        /*for (int i = 0; i <num.length ; i++) {
            String s = Integer.toString(num[i]);
            bf.write(s);
            bf.write("\n");
        }*/
        bf.close();
    }
}


