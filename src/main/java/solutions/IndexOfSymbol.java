package solutions;

import java.util.Scanner;

public class IndexOfSymbol {

    private static char symbol;

   /* public static void main1(String[] args) {
            Scanner in;
            in = new Scanner("a" +
                    "c" +
                    "z");
            while (in.hasNext()) {
                indexOf(in.next().charAt(0));
            }
    }
        public static void indexOf(String symbol) {
            int min = 1;
            int max = 26;

            char c = symbol;
            for (int i = min; i <= max; i++) {
              symbol = (char) i;
                System.out.print(i+" ");
            }
        }*/

    public static void main(String[] args) {
        /*Scanner in;
        in = new Scanner("a" +
                "c" +
                "z");
        String n = in.next();
        char[] c = n.toCharArray();
        int min = 1;
        int max = 26;

        for (int i = min; i <= max; i++) {
            c[i] = (char) i;
            System.out.print(i+" ");
        }*/
        /*for (int i = 97; i <=122 ; i++) {
            System.out.printf("%d : %c\n",i,i);
        }*/
        Scanner in;
        in = new Scanner("a" +
                "c" +
                "z");
        String n1 = in.next();
        System.out.println(n1);

            for (int i = 0; i < n1.length() ; i++) {

                System.out.println(n1.charAt(i));
            }


    }

}
