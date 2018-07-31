package solutions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SubstringOccur {
        public static void main1(String[] args) {
        Scanner in = new Scanner("asdjldsfasdioasfasd\n" +
                "asd");
        String s = in.next();
        String sub = in.next();
        System.out.println(s);
        System.out.println(sub);
        String[] subS = s.split(sub);
        System.out.println(Arrays.toString(subS));
        int count = 0;
        for (int i = 0; i < subS.length; i++) {
            if (subS[i] != sub) count++;
        }
        System.out.println(count);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner("asdjldsfasdioasfasd\n" +
                "asd");
        String s = in.next();
        String sub = in.next();

        System.out.println(solve(s));
    }

    public static int solve(String s) {
        int count = 0;
        String sub = "asd";
        for (int i = 0; i < s.length(); i++)
            if ( sub.length() == s.length()) {
                count++;
            }
        return count;

    }

    public static void main3(String[] args) {
        Scanner in = new Scanner("asdjldsfasdioasfasd\n" +
                "asd");
        String s = in.next();
        String sub = in.next();
        int count = 0;
        int index = s.indexOf(sub);
        while (index!=-1) {
            index = s.indexOf(sub, index+1);
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner("asdjldsfasdioasfasd\n" +
                "asd");
        String s = in.next();
        String sub = in.next();
        System.out.println(s.indexOf(sub));
    }

}