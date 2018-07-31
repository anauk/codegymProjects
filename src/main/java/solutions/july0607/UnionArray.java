package solutions.july0607;

import java.util.Arrays;

public class UnionArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int[] res = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length ; i++) {
            res[i] = a1[i];
        }
        for (int j = 0; j < a2.length ; j++) {
            res[j + a1.length] = a2[j];
        }
        System.out.println(Arrays.toString(a1) + " - one array");
        System.out.println(Arrays.toString(a2) + " - two array");
        System.out.println(Arrays.toString(res) + " - After");
    }
}
