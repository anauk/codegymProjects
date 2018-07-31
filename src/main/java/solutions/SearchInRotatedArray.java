package solutions;

import java.util.*;

public class SearchInRotatedArray {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner("8\n" +
                "5 6 7 0 1 2 3 4");
        java.io.PrintStream out = System.out;

        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        out.println(search(array));
    }


    public static int search(int[] array) {
        int min=array[0];
        for(int i=0; i<array.length; i++)
            if (array[0]>array[i]) {
                min = array[i];
            }
        return 0;
    }

}