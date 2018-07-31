package solutions.july0607;

import java.util.Arrays;

public class UnificationOf {
    public static boolean combin(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4};
        int[] n2 = {2, 4, 5, 1, 6};
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
        int[] same = new int[n1.length];
        int index_res = 0;
        int count = 0;
        for (int i = 0; i < n1.length; i++) {
            if(combin(n1, n2[i])){
                same[index_res] = n2[i];
                count += index_res;
                index_res++;
            }
        }
        System.out.println(Arrays.toString(same) + " - " + count);
        int[] different = new int[n1.length + n2.length];
        int index_dif = 0;
        for (int j = 0; j < n1.length; j++) {
            if(!combin(n1, n2[j])) {
                different[index_dif] = n2[j];
                index_dif++;
            }
        }
        for (int j = 0; j <n2.length-1 ; j++) {
            if(!combin(n2, n1[j])){
                different[index_dif+n1.length]=n1[j];
                index_dif++;
            }
        }
        System.out.println(Arrays.toString(different)+" - different");
    }
}
