package solutions.june180629;

import java.util.Arrays;

public class Xz {
    public static void main1(String[] args) {
        String str = new String("java");
        int i = 1;
        char j = 3;
        System.out.println(str.substring(i,j));
        System.out.println(str.indexOf('v'));
        String s = "ava";
        char ch = 74;
        int in = 10;
        s = ch + s + in;
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("you java");
        s1.insert(2, "like ");
        System.out.println(s1);
    }
/*
Сложить два массива в один*/
    public static void main4(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6,};
        int[] res = new int [a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            res[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            res[i+a1.length] = a2[i];
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(res));
    }
    /*
    * На основе повтор цифр Из двух массивов сделать третий*/
    public static boolean contain(int[] a, int k){
        for (int i = 0; i < a.length; i++) {
           if( a[i] == k){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 5, 6};
        int[] a2 = {1, 5, 6, 8, 4};
        int[] res = new int [a1.length];
        int indexRes = 0;

        for (int i = 0; i < a1.length; i++) {
            if(contain(a2,a1[i])){
                //System.out.println(a1[i]);
                res[indexRes] = a1[i];
                indexRes++;
            }
        }
        int[] resfinal = new int[indexRes];
        for (int i = 0; i < indexRes; i++) {
            resfinal[i] = res[i];
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(resfinal));
    }
    /* Сгенерировать массив,найти максимальный, минимальный*/
    public static void main_(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() * 100);
        }
        int max = num[0];
        int min = num[0];
        int index_max = 0;
        int index_min = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i]>max) {
                max = num[i];
                index_max =  i;
            }
            if (num[i]<min) {
                min = num[i];
                index_min = i;
            }
        }
        System.out.println(Arrays.toString(num) + "befor");
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        revers(num,index_max,index_min);
        System.out.println(Arrays.toString(num));
    }
    public static void revers (int [] num, int l, int k){
        int temp = num[l];
        num[l] = num[k];
        num[k] = temp;
    }
}
