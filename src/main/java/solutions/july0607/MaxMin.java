package solutions.july0607;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
/*
В задаче два примера с вычислением минимального числа и максимального.
Один способ оформлен отдельно в метод.
Другой прописан в самом коде*/

public class MaxMin {
    public static int revers(int[] numbers, int min_index, int max_index){
        int swap = numbers[min_index];
        numbers[min_index] = numbers[max_index];
        numbers[max_index] = swap;
        return swap;
    }
    public static void count(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if(max < numbers[i]) {
                max = numbers[i];
            }

            sum = sum + numbers[i];
        }
        double average = ((double)sum) / numbers.length;
        System.out.printf("%d %d %d %.2f", min,  max, sum, average);
    }
    public static void main_(String[] args) {
        int[] numbers= new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        int min = numbers[0];
        int max_num = 0;
        int min_num = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
                min_num = i;
            }
            if(numbers[i] > max) {
                max = numbers[i];
                max_num = i;
            }
        }
        count(numbers);
        System.out.printf("\n" + "max%d:min%d",max, min);
        revers(numbers, min_num, max_num);
        System.out.println("\n"+Arrays.toString(numbers));
    }
//через колекцию
    public static void main(String[] args) {
        //Integer[] a = {1, 3, 5, 6, 7, 16};
        int [] a = {1, 3, 5, 6, 7, 16};
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
        System.out.println(Arrays.toString(a));
        int max = Collections.max(b);
        int min = Collections.min(b);
        System.out.println(min);
        System.out.println(max);
    }
//в отсортированом массиве
    public static void main2(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 16};
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];
        System.out.println(Arrays.toString(a));
        System.out.println(min + " " + max);
    }
    //через стримы
    public static void main5(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 16};
        int min= Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println(Arrays.toString(a));
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println(maxValue(a));
    }
    //через отдельный метод
    public static int maxValue(final int[] intArray) {
        return IntStream.range(0,intArray.length).map(i->intArray[i]).max().getAsInt();
        //range(0,intArray.length)-создание потока элементов массива;
        //map(i->intArray[i])-сопоставление каждого эл. потока с фактическим элементом;
        //max()-получить макс. эл. этого потока как OptionalInt;
    }
}
