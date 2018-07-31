/*import java.util.*;

public class RestoreArray {
    public static void main(String[] args) {
        Scanner in = new Scanner("8\n" +
                "1 2 -1 4 7 6 -2 4");

        int n = in.nextInt();
        int [] values = new int[n];

        while (--n >= 0)
            values[values.length-n-1] = in.nextInt();

        System.out.println (Solution.getFormattedString(Solution.restoreArray (values)));

    }

    private static int[] restoreArray (int[] values){

        for (int i = 0; i < values.length; i++){
            if (Solution.isNegative (values[i])){
                values[i] = Solution.getAverage (values[i-1], values[i+1]);
                i++;
            }
        }

        return values;

    }

    private static boolean isNegative (int e){

        return e < 0;
    }

    private static int getAverage (int e1, int e2){

        return (e1 + e2) / 2 ;
    }

    private static String getFormattedString (int[] array){

        StringBuilder strB = new StringBuilder(array.length);

        for (int i : array)
            strB.append(i+" ");

        return strB.toString().trim();

    }

}*/
