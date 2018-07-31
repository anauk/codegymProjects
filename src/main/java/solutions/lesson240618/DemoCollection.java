package solutions.lesson240618;

import javafx.print.Collation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

/*
 Сгенерировать коллекию со 100 уникальными произвольными четными числами в диапазоне от 1 до 1000
отсортировать
записать в файл
 */
public class DemoCollection {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> num = new ArrayList<>();//создаю колекцию
           for (int i = 1; i <=1000; i+=10) {//заполняю ее последовательностью чисел от 1 до 1000,с шагом 10
            num.add(i);
        }
        Collections.shuffle(num);//организация произвольного порядка
        for (int i = 0; i < 10; i++) {
            System.out.print(num.get(i)+ " ");// показываю,что порядок произвольный выводя 10 чисел
        }
        HashMap<Integer, Boolean> sor = new HashMap<>();
        for (int i = 0; i < num.size(); i++) {
            sor.put(num.get(i),true);//мар содержит уникальные ключи, проверяю,чтобы цыфры не повторялись
        }
        System.out.println(num.size() == sor.size());//если размеры равны, то в исходной коллекции числа уникальны
        num.sort(new Comparator<Integer>() {//сортировка
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("All: "+ num);//вывод чисел в консоль
        System.out.println(num.size());//вывод размера коллекциий в консоль

       File end = new File("src/main/java/solutions/lesson240618","sort.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(end));

        num.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer item) {
                try {
                    bw.write(item.toString());
                    bw.write(" ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        bw.close();
    }
}
