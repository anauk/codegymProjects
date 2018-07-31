package solutions.june180629;

import java.util.*;
import java.util.stream.IntStream;

/*2. Дан массив из целочисленных значений.
2.1.
2.2.Необходимо четные числа выделить в один массив,
нечетные числа выделить в другой массив.
каждый массив должен иметь длину НЕ БОЛЬШЕ количества содержащихся элементов.
2.3.Посчитать количество значений в каждом массиве
*/
public class ArrayCount {
    public static void main(String[] args) {
        int n = 15;
        int maxVal = 15;
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        int size = nums.size();
        while (size < n) {
            nums.add(random.nextInt(maxVal));
            size = nums.size();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.printf("Array before: %s\n", nums);
        System.out.println("Четные числа: " + even + " = " + even.size());
        System.out.println("Не четные числа: " + odd + " = " + odd.size());
    }
    /*2 вариант*/
    public static int[] produce(int amount) {
        return IntStream.generate(()->(int)(Math.random()*100)).limit(amount).toArray();
    }

    public static void main_(String[] args) {
        int[] data = produce(30);

        int[] even = Arrays.stream(data).filter(i -> i % 2 == 0).toArray();

        int[] odd = Arrays.stream(data).filter(i -> i % 2 == 1).toArray();

        System.out.printf("Array before: %s\n", Arrays.toString(data));
        System.out.printf("Array of evens: %s, length:%d\n", Arrays.toString(even), even.length);
        System.out.printf("Array of odds: %s, length:%d\n", Arrays.toString(odd), odd.length);
    }
}
