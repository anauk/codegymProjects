package solutions.june180629;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
Сгенерировать коллекию со 100 уникальными простыми числами в диапазоне от 1 до 1000
отсортировать по убыванию
записать в файл
*/
public class Random2 {
    public static void main(String[] args) throws IOException {
        int rang = 100;
        int maxVal = 1000;
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        int size = integers.size();
        while(size < rang){
            integers.add(random.nextInt(maxVal));
            size = integers.size();
        }
        integers.sort((o1,o2)->o2-o1);
        System.out.println(integers.toString());
        System.out.println(integers);
        BufferedWriter bf = new BufferedWriter(new FileWriter(new File("src/main/java/solutions/june180629", "ran.txt")));
        for (Integer integer : integers) {
            String s = integer.toString();
            bf.write(s);
            bf.write("\n");
        }
        bf.close();
    }
}
