package solutions.june180629;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import algorithms.simples.SimpleV4;

import java.util.Arrays;

/*
 Найти все 4х-значные простые числа.
Посчитать их количество
*/
public class Count {
    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1000; i <=9999 ; i++) {
            if (isSimple(i)) {
                list.add(i);
                }
            }
        System.out.println(list);
        System.out.println(list.size());
    }

    private static boolean isSimple(int n) {
        for (int i = 2; i < n ; i++) {
            if(n%i == 0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        final int min=1000;
        final int max=9999;

        SimpleV4 algorithm = new SimpleV4(min, max);
        int[] simples = algorithm.array();
        int count = simples.length;

        System.out.printf("Simples values: %s\n", Arrays.toString(simples));
        System.out.printf("Count simples between %d and %d is %d\n",
                min, max, count);
    }
}
